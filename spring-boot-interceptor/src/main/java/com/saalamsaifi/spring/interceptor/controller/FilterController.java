package com.saalamsaifi.spring.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {
	@GetMapping(value = "/resource/secure")
	public String secure() {
		return "You are accessing secured resource";
	}

	@GetMapping(value = "/resource/public")
	public String open() {
		return "You are accessing public resource";
	}

}
