package com.tracing.representation.response;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "spring-consumer-two", url = "http://localhost:8082")
public interface SpringConsumerTwo {

    @GetMapping("/v1/hello")
    String hello();
}

