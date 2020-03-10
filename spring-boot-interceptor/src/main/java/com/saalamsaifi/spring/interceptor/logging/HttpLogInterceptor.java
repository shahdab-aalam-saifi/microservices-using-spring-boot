package com.saalamsaifi.spring.interceptor.logging;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class HttpLogInterceptor extends HandlerInterceptorAdapter {
  private static final Logger LOGGER = LoggerFactory.getLogger(HttpLogInterceptor.class);

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    LOGGER.info(
        "user@{} is requesting for resource at {}",
        request.getRemoteAddr(),
        request.getRequestURI());
    request.setAttribute("start-time", System.currentTimeMillis());

    return super.preHandle(request, response, handler);
  }

  @Override
  public void postHandle(
      HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
      ModelAndView modelAndView)
      throws Exception {
    LOGGER.info("user@{} is consuming resource", request.getRemoteAddr());

    super.postHandle(request, response, handler, modelAndView);
  }

  @Override
  public void afterCompletion(
      HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
      throws Exception {
    super.afterCompletion(request, response, handler, ex);
    long startTime = Long.parseLong("" + request.getAttribute("start-time"));
    long endTime = System.currentTimeMillis();
    long consumed = endTime - startTime;
    LOGGER.info(
        "user@{} consumed resource at {} for {}ms",
        request.getRemoteAddr(),
        request.getRequestURI(),
        consumed);
  }
}
