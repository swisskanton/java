package com.spring6restmvc.controller;

import com.spring6restmvc.model.Customer;
import com.spring6restmvc.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> listCostumer() {
        log.debug("Get Customers - in controller");
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/{customerId}", method = RequestMethod.GET)
    public Customer gerCustomerById(@PathVariable("customerId") UUID customerId) {
        log.debug("Get Customer by Id "  + customerId + " - in controller");
        return customerService.getCustomerById(customerId);
    }
}
