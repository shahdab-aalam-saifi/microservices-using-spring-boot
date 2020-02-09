package com.saalamsaifi.sbreact.repository;

import org.springframework.data.repository.CrudRepository;

import com.saalamsaifi.sbreact.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}