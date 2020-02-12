package com.saalamsaifi.spring.security.cors.controller;

import com.saalamsaifi.spring.security.cors.model.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
  private static final Logger log = LoggerFactory.getLogger(Greeting.class);
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @CrossOrigin(origins = "http://localhost:9000")
  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(required = false, defaultValue = "World") String name) {
    log.info("==== greeting ====");
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

  @GetMapping("/greeting-javaconfig")
  public Greeting greetingWithJavaconfig(
      @RequestParam(required = false, defaultValue = "World") String name) {
    log.info("==== greetingWithJavaconfig ====");
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }
}
