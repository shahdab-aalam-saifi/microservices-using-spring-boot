package com.saalamsaifi.externalization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saalamsaifi.externalization.config.ExternalConfig;

@SpringBootApplication
public class SpringBootExternalizationApplication implements CommandLineRunner {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBootExternalizationApplication.class);

	@Value("${external.name}")
	private String name;
	
	@Autowired
	private ExternalConfig config;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExternalizationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("external.name: {}", name);
		LOGGER.info("external.message: {}", config.getMessage());
	}

}
