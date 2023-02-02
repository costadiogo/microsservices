package com.fraud.controller;

import com.fraud.record.FraudCheckResponse;
import com.fraud.service.FraudCheckHistoryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
@Slf4j
public class FraudCheckHistoryController {

    private final FraudCheckHistoryService service;

    @GetMapping("/fraud-check/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {

        boolean isFraudulentCustomer = service.isFraudulentCustomer(customerId);

        log.info("Fraud check request for customer {}", customerId);

        return new FraudCheckResponse(isFraudulentCustomer);
    }

}
