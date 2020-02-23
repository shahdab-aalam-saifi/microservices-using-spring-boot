package com.saalamsaifi.spring.boot.authenticate.ldap.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class HttpRequestInterceptor implements HandlerInterceptor {
  private static final Logger LOG = LoggerFactory.getLogger(HttpRequestInterceptor.class);

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    LOG.debug(
        "PreHandle::{}::{}::{}",
        request.getRemoteAddr(),
        request.getRemotePort(),
        request.getQueryString());
    return HandlerInterceptor.super.preHandle(request, response, handler);
  }

  @Override
  public void postHandle(
      HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
      ModelAndView modelAndView)
      throws Exception {
    LOG.debug(
        "PostHandle::{}::{}::{}::{}",
        request.getRemoteAddr(),
        request.getRemotePort(),
        request.getQueryString(),
        response.getStatus());
    HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
  }

  @Override
  public void afterCompletion(
      HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
      throws Exception {
    LOG.debug(
        "AfterCompletion::{}::{}::{}::{}",
        request.getRemoteAddr(),
        request.getRemotePort(),
        request.getQueryString(),
        response.getStatus());
  }
}
