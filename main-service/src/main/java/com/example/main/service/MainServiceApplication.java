package com.example.main.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
public class MainServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainServiceApplication.class, args);
    }

//    @Bean
//    ApplicationListener<ContextRefreshedEvent> listener() {
//        return refreshedEvent -> {
//            System.out.println("CUSTOM EVENT");
//        };
//    }

}
