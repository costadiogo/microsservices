package com.customer.controller;

import com.customer.record.CustomerRegistrationRequest;
import com.customer.service.CustomerService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/customers")
    public void  registerCostumer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("new customer registration {}", customerRegistrationRequest);

        customerService.registerCustomer(customerRegistrationRequest);
    }
}
