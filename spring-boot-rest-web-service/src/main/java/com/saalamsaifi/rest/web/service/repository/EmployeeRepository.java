package com.saalamsaifi.rest.web.service.repository;

import com.saalamsaifi.rest.web.service.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
