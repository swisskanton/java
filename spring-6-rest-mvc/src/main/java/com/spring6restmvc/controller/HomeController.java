package com.spring6restmvc.controller;

import com.spring6restmvc.model.Beer;
import com.spring6restmvc.model.Customer;
import com.spring6restmvc.services.BeerService;
import com.spring6restmvc.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class HomeController {

    private final BeerService beerService;
    private final CustomerService customerService;

    @RequestMapping(value = "/beer", method = RequestMethod.GET)
    public List<Beer> listBeers() {
        return beerService.listBeers();
    }

    @RequestMapping(value = "/beer/{beerId}", method = RequestMethod.GET)
    public Beer gerBeerById(@PathVariable("beerId") UUID beerId) {
        log.debug("Get Beer by Id - in controller");
        return beerService.getBeerById(beerId);
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public List<Customer> listCostumer() {
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    public Customer gerCustomerById(@PathVariable("customerId") UUID customerId) {
        log.debug("Get Beer by Id - in controller");
        return customerService.getCustomerById(customerId);
    }
}
