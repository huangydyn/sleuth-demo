package com.tracing.representation;

import com.tracing.infrustructure.FlaskConsumer;
import com.tracing.infrustructure.SpringConsumerOne;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1")
public class HelloController {

    private SpringConsumerOne springConsumerOne;

    private FlaskConsumer flaskConsumer;

    public HelloController(SpringConsumerOne springConsumerOne,
                           FlaskConsumer flaskConsumer) {
        this.springConsumerOne = springConsumerOne;
        this.flaskConsumer = flaskConsumer;
    }

    @ApiOperation("hello")
    @GetMapping("/hello")
    public String hello() {
        log.info("Request start");
        // log.info("Test request met error", new IllegalAccessException("error"));
        log.info("Spring Consumer One Response: {}", springConsumerOne.hello());
        // log.info("Flask Consumer Response: {}", flaskConsumer.hello());
        return "hello";
    }
}
