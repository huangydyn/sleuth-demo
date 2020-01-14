package com.tracing.infrustructure;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "spring-consumer-one", url = "http://localhost:8081")
public interface SpringConsumerOne {

    @GetMapping("/v1/hello")
    String hello();
}
