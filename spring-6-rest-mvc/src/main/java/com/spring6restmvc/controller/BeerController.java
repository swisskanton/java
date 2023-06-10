package com.spring6restmvc.controller;

import com.spring6restmvc.model.Beer;
import com.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
public class BeerController {

    private final BeerService beerService;

    @RequestMapping("/api/v1/beer")
    public List<Beer> listBeers() {
        return beerService.listBeers();
    }

    @RequestMapping("/api/v1/beer/{beerId}")
    public Beer gerBeerById(@PathVariable("beerId") UUID beerId) {
        log.debug("Get Beer by Id - in controller");
        return beerService.getBeerById(beerId);
    }
}
