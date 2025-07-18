package com.baoli.pricer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class PricerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricerApplication.class, args);
    }

}
