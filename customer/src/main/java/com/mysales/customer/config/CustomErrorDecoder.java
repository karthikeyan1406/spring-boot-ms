package com.mysales.customer.config;

import javax.naming.AuthenticationException;



import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {

    return switch (response.status()) {
    case 401 -> new AuthenticationException("invalid credentials");
    default -> new Exception("Generic exception");
    };
  }
}


