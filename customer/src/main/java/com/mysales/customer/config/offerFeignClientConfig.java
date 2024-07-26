package com.mysales.customer.config;

import org.springframework.context.annotation.Bean;

import feign.Logger;
import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;

public class offerFeignClientConfig {

	  @Bean
	  Logger.Level feignLoggerLevel() {
	    return Logger.Level.BASIC;
	  }
	  @Bean
	  RequestInterceptor requestInterceptor() {
	     return requestTemplate -> {
	          requestTemplate.header("Content-Type", "application/json");
	          requestTemplate.header("Accept", "application/json");
	          requestTemplate.header("header_1", "value_1");
	        };
	   }
	   @Bean
	   BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
	      return new BasicAuthRequestInterceptor("mysales", "pwd1");
	   }
	   
	   @Bean
	   ErrorDecoder myErrorDecoder() {
		   return new CustomErrorDecoder();
	   }
}
