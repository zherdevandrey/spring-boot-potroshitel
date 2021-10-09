package com.example.test.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/*
* Can have access spring application, environment before context build start
* */
public class EnvironmentValidator implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        environment.getSystemProperties()
                .forEach((key, val) -> System.out.println(key + " - " + val));
    }
}
