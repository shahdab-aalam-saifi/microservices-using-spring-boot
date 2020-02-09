package com.saalamsaifi.data.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.saalamsaifi.data.rest.entity.Person;
import com.saalamsaifi.data.rest.repository.PersonRepository;

@SpringBootApplication
public class SpringBootDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(PersonRepository repository) {
		return args -> {
			// save a few person
			repository.save(new Person("Jack", "Bauer"));
			repository.save(new Person("Chloe", "O'Brian"));
			repository.save(new Person("Kim", "Bauer"));
			repository.save(new Person("David", "Palmer"));
			repository.save(new Person("Michelle", "Dessler"));
		};
	}
}