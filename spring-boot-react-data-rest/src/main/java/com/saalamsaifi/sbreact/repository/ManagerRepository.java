package com.saalamsaifi.sbreact.repository;

import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.saalamsaifi.sbreact.entity.Manager;

@RepositoryRestResource(exported = false)
public interface ManagerRepository extends Repository<Manager, Long> {

	Manager save(Manager manager);

	Manager findByName(String name);

}