package com.tchokoapps.springboot.microservices.limitsservices.configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@ConfigurationProperties(prefix = "limits-services")
@Configuration
public class Config {
    private int min;
    private int max;
}
