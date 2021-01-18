package com.tchokoapps.springboot.microservices.limitsservices.controllers;

import com.tchokoapps.springboot.microservices.limitsservices.beans.Limits;
import com.tchokoapps.springboot.microservices.limitsservices.configs.Config;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LimitsController {

    private Config config;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(config.getMin(), config.getMax());
    }
}
