package com.tracing.representation;

import com.tracing.representation.response.SpringConsumerTwo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1")
public class HelloController {

    private SpringConsumerTwo springConsumerTwo;

    public HelloController(SpringConsumerTwo springConsumerTwo) {
        this.springConsumerTwo = springConsumerTwo;
    }

    @ApiOperation("hello")
    @GetMapping("/hello")
    public String hello() {
        log.info("Spring EnterPoint request received");
        springConsumerTwo.hello();
        return "Spring Consumer One say hello";
    }
}
