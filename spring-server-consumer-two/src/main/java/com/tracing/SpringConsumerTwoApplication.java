package com.tracing;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringCloudApplication
@SuppressWarnings("PMD.UseUtilityClass")
public class SpringConsumerTwoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SpringConsumerTwoApplication.class, args);
    }

}
