package com.saalamsaifi.spring.boot.websocket;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import com.saalamsaifi.spring.boot.websocket.handler.EchoHandler;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EchoHandlerTest {
  private final EchoHandler handler = new EchoHandler();

  @Test
  public void shouldEchoMessage() throws Exception {
    WebSocketSession mockSession = mock(WebSocketSession.class);
    TextMessage msg = new TextMessage("Hello World!");
    handler.handleTextMessage(mockSession, msg);
    verify(mockSession, times(1)).sendMessage(eq(new TextMessage("Received: Hello World!")));
  }
}
