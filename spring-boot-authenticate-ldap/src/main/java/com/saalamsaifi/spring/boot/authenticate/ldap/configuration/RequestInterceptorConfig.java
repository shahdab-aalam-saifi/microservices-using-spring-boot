package com.saalamsaifi.spring.boot.authenticate.ldap.configuration;

import com.saalamsaifi.spring.boot.authenticate.ldap.interceptors.HttpRequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class RequestInterceptorConfig implements WebMvcConfigurer {
  @Autowired private HttpRequestInterceptor httpRequestInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(httpRequestInterceptor);
    WebMvcConfigurer.super.addInterceptors(registry);
  }
}
