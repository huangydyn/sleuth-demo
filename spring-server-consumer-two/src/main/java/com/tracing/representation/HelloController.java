package com.tracing.representation;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/v1")
public class HelloController {

    @ApiOperation("hello")
    @GetMapping("/hello")
    public String hello(@RequestHeader Map<String, String> headers) {
        headers.forEach((k, v) -> log.info("Header: {}, Value: {}", k, v));
        log.info("Flask Consumer request received");
        return "Spring Consumer Two say hello";
    }
}
