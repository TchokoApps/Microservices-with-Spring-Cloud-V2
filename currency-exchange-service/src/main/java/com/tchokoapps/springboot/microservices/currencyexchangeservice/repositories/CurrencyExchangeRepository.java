package com.tchokoapps.springboot.microservices.currencyexchangeservice.repositories;

import com.tchokoapps.springboot.microservices.currencyexchangeservice.entities.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);
}
