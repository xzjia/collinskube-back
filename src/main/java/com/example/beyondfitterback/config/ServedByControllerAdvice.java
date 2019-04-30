package com.example.beyondfitterback.config;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.net.InetAddress;
import java.net.UnknownHostException;

@ControllerAdvice
public class ServedByControllerAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter,
                                  MediaType mediaType, Class aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        String hostname;
        try {
            hostname = InetAddress.getLocalHost().getHostName();

        } catch (UnknownHostException e) {
            e.printStackTrace();
            hostname = "Unknown host";
        }
        serverHttpResponse.getHeaders().add("Served-By", hostname);
        return body;
    }
}
