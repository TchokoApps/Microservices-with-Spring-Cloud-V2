package com.tchokoapps.springboot.microservices.currencyexchangeservice.controllers;

import com.tchokoapps.springboot.microservices.currencyexchangeservice.entities.CurrencyExchange;
import com.tchokoapps.springboot.microservices.currencyexchangeservice.repositories.CurrencyExchangeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@Slf4j
@RestController
public class CurrencyExchangeController {

    private final Environment environment;
    private CurrencyExchangeRepository currencyExchangeRepository;

    public CurrencyExchangeController(Environment environment, CurrencyExchangeRepository currencyExchangeRepository) {
        this.environment = environment;
        this.currencyExchangeRepository = currencyExchangeRepository;
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

        CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from, to);
        currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
        log.info(currencyExchange.toString());
        Objects.requireNonNull(currencyExchange);

        return currencyExchange;
    }
}
