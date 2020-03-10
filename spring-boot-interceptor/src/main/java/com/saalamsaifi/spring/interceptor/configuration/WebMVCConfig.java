package com.saalamsaifi.spring.interceptor.configuration;

import com.saalamsaifi.spring.interceptor.logging.HttpLogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
  @Autowired private HttpLogInterceptor logInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry
        .addInterceptor(logInterceptor)
        .addPathPatterns("/resource/secure")
        .excludePathPatterns("/resource/public");

    WebMvcConfigurer.super.addInterceptors(registry);
  }
}
