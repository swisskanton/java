package com.spring6restmvc.controller;

import com.spring6restmvc.services.BeerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeerControllerTest {

    @Autowired
    BeerController homeController;

    @Test
    void gerBeerById() {
        System.out.println(homeController.gerBeerById(UUID.randomUUID()));
    }
}