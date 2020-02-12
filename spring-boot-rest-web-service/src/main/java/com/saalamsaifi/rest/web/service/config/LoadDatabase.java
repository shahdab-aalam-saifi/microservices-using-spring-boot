package com.saalamsaifi.rest.web.service.config;

import com.saalamsaifi.rest.web.service.model.Employee;
import com.saalamsaifi.rest.web.service.model.Order;
import com.saalamsaifi.rest.web.service.model.Status;
import com.saalamsaifi.rest.web.service.repository.EmployeeRepository;
import com.saalamsaifi.rest.web.service.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  public CommandLineRunner initDatabase(
      EmployeeRepository employeeRepository, OrderRepository orderRepository) {
    return args -> {
      log.info("Preloading {}", employeeRepository.save(new Employee("Bilbo Baggins", "burglar")));
      log.info("Preloading {}", employeeRepository.save(new Employee("Frodo", "Baggins", "thief")));

      log.info("Preloading {}", orderRepository.save(new Order("MacBook Pro", Status.COMPLETED)));
      log.info("Preloading {}", orderRepository.save(new Order("iPhone", Status.IN_PROGRESS)));
    };
  }
}
