package com.example.test.starter;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@AllArgsConstructor
public class MailContextListener implements ApplicationListener<ContextRefreshedEvent> {

    private final MailProperties mailProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent refreshedEvent) {
        mailProperties.getTo()
                .forEach(val -> System.out.println("MAIL SENT TO " + val));
    }
}
