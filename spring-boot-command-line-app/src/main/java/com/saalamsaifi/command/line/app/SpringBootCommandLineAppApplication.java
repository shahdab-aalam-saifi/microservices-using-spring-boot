package com.saalamsaifi.command.line.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCommandLineAppApplication implements CommandLineRunner {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(SpringBootCommandLineAppApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(SpringBootCommandLineAppApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    LOGGER.info("Hello World!");
  }
}
