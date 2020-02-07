package com.saalamsaifi.rest.web.service.exception;

public class EmployeeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2861503321511530245L;

	public EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}