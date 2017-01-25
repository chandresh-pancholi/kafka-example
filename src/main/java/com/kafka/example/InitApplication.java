package com.kafka.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

/**
 * Created by creyate on 25/01/17.
 */
@Component
@EnableAutoConfiguration
public class InitApplication {
    public static void main(String[] args) {
        SpringApplication.run(InitApplication.class, args);
    }
}
