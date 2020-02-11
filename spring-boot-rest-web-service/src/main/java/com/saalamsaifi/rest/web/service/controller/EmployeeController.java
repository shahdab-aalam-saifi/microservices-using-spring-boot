package com.saalamsaifi.rest.web.service.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saalamsaifi.rest.web.service.exception.EmployeeNotFoundException;
import com.saalamsaifi.rest.web.service.model.Employee;
import com.saalamsaifi.rest.web.service.repository.EmployeeRepository;
import com.saalamsaifi.rest.web.service.resource.assembler.EmployeeResourceAssembler;

@RestController
public class EmployeeController {

	private final EmployeeRepository repository;
	private final EmployeeResourceAssembler assembler;

	EmployeeController(EmployeeRepository repository, EmployeeResourceAssembler assembler) {
		this.repository = repository;
		this.assembler = assembler;
	}

	// Aggregate root
	@GetMapping("/employees")
	public Resources<Resource<Employee>> all() {
		List<Resource<Employee>> employees = repository.findAll().stream().map(assembler::toResource)
				.collect(Collectors.toList());

		return new Resources<>(employees, linkTo(methodOn(EmployeeController.class).all()).withSelfRel());
	}

	@PostMapping("/employees")
	public ResponseEntity<?> newEmployee(@RequestBody Employee newEmployee) throws URISyntaxException {
		Resource<Employee> resource = assembler.toResource(repository.save(newEmployee));

		return ResponseEntity.created(new URI(resource.getId().expand().getHref())).body(resource);
	}

	// Single item
	@GetMapping("/employees/{id}")
	public Resource<Employee> one(@PathVariable Long id) {
		Employee employee = repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));

		return assembler.toResource(employee);
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<?> replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id)
			throws URISyntaxException {

		Employee updatedEmployee = repository.findById(id).map(employee -> {
			employee.setName(newEmployee.getName());
			employee.setRole(newEmployee.getRole());
			return repository.save(employee);
		}).orElseGet(() -> {
			newEmployee.setId(id);
			return repository.save(newEmployee);
		});

		Resource<Employee> resource = assembler.toResource(updatedEmployee);

		return ResponseEntity.created(new URI(resource.getId().expand().getHref())).body(resource);
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
		repository.deleteById(id);

		return ResponseEntity.noContent().build();
	}
}