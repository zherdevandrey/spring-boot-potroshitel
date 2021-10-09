package com.example.test.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.*;


@Data
@Configuration
@ConfigurationProperties(prefix = "mail")
public class MailProperties {

    private List<String> to;

}
