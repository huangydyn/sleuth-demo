package com.tracing;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableHystrix
@SpringCloudApplication
@SuppressWarnings("PMD.UseUtilityClass")
@EnableFeignClients(basePackages = "com.tracing")
public class EnterPointApplication {

    public static void main(final String[] args) {
        SpringApplication.run(EnterPointApplication.class, args);
    }

}
