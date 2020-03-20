package com.saalamsaifi.spring.boot.messagebroker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@EnableWebSocketMessageBroker
@SpringBootApplication
public class SpringBootMessageBrokerApplication implements WebSocketMessageBrokerConfigurer {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootMessageBrokerApplication.class, args);
  }

  @Override
  public void configureMessageBroker(MessageBrokerRegistry registry) {
    registry.enableSimpleBroker("/topic");
    registry.setApplicationDestinationPrefixes("/app");
    WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);
  }

  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
    registry.addEndpoint("/echo-endpoint");
    WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);
  }
}
