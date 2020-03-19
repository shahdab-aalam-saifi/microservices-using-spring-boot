package com.saalamsaifi.spring.boot.messagebroker.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class EchoHandler {
  @MessageMapping("/echo")
  @SendTo("/topic/echo")
  public String echo(String msg) {
    return "Received: " + msg;
  }
}
