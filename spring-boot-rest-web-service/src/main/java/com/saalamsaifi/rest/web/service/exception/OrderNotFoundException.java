package com.saalamsaifi.rest.web.service.exception;

public class OrderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5662113600619712519L;

	public OrderNotFoundException(Long id) {
		super("Could not find order " + id);
	}
}