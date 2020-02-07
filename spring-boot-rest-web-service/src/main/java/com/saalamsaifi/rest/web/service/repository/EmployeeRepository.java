package com.saalamsaifi.rest.web.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saalamsaifi.rest.web.service.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}