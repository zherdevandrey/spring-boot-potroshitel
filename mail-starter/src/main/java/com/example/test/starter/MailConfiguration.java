package com.example.test.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MailProperties.class)
public class MailConfiguration {

    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("mail.to")
   // @ConditionalOnMissingBean(ApplicationListener.class)
    public MailContextListener ravenListener(MailProperties mailProperties){
        return new MailContextListener(mailProperties);
    }

}
