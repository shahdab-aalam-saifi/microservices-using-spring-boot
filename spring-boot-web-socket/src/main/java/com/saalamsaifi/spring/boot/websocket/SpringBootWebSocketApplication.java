package com.saalamsaifi.spring.boot.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import com.saalamsaifi.spring.boot.websocket.handler.EchoHandler;

@EnableWebSocket
@SpringBootApplication
public class SpringBootWebSocketApplication implements WebSocketConfigurer {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootWebSocketApplication.class, args);
  }

  @Bean
  public EchoHandler echoHandler() {
    return new EchoHandler();
  }

  @Override
  public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
    registry.addHandler(echoHandler(), "/echo");
  }
}
