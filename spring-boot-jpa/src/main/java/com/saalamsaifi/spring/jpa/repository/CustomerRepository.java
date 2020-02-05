package com.saalamsaifi.spring.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.saalamsaifi.spring.jpa.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);
}