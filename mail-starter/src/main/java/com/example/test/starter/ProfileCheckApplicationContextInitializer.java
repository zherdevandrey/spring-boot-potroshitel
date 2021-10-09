package com.example.test.starter;

import org.springframework.context.ConfigurableApplicationContext;

/*
* Can have access to applicationContext just after creating. On this step applicationContext is empty
* */
public class ProfileCheckApplicationContextInitializer implements org.springframework.context.ApplicationContextInitializer  {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if(applicationContext.getEnvironment().getActiveProfiles().length == 0){
            throw new RuntimeException("PLEASE SET UP PROFILE");
        }
    }
}
