package com.saalamsaifi.spring.boot.messagebroker;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import com.saalamsaifi.spring.boot.messagebroker.controller.EchoHandler;

public class EchoHandlerTest {
  private final EchoHandler handler = new EchoHandler();

  @Test
  public void shouldEchoMessage() throws Exception {
    String msg = "Hello World!";
    assertThat(handler.echo(msg)).isEqualTo("Received: " + msg);
  }
}
