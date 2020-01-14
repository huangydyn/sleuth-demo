package com.tracing;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringCloudApplication
@EnableFeignClients(basePackages = "com.tracing")
@SuppressWarnings("PMD.UseUtilityClass")
public class SpringConsumerOneApplication {

    public static void main(final String[] args) {
        SpringApplication.run(SpringConsumerOneApplication.class, args);
    }

}
