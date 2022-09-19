package com.cydeo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
@ConfigurationProperties(prefix = "db")
@Data
public class DBConfigData {

    private String usernamE;
    private String password;
    private List<String> type;
}
