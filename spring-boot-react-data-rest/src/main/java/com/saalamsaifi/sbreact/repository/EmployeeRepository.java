package com.saalamsaifi.sbreact.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

import com.saalamsaifi.sbreact.entity.Employee;

@PreAuthorize("hasRole('ROLE_MANAGER')")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

	@Override
	@PreAuthorize("#employee?.manager == null or #employee?.manager?.name == authentication?.name")
	public Employee save(@Param("employee") Employee employee);

	@Override
	@PreAuthorize("@employeeRepository.findById(#id)?.manager?.name == authentication?.name")
	public void deleteById(@Param("id") Long id);

	@Override
	@PreAuthorize("#employee?.manager?.name == authentication?.name")
	public void delete(@Param("employee") Employee employee);

}