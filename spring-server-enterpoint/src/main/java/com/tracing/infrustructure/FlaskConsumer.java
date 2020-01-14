package com.tracing.infrustructure;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "flask-consumer", url = "http://localhost:5000")
public interface FlaskConsumer {

    @GetMapping("/v1/hello")
    String hello();
}
