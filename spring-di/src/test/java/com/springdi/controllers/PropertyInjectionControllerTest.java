package com.springdi.controllers;

import com.springdi.services.GreetingService;
import com.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectionControllerTest {

    @Autowired
    PropertyInjectionController propertyInjectionController;

    /*@BeforeEach
    void setUp() {
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingService = new GreetingServiceImpl();
    }*/

    @Test
    void sayHello() {
        //System.out.println(propertyInjectionController.greetingService.sayGreeting());
        System.out.println(propertyInjectionController.sayHello());

    }
}