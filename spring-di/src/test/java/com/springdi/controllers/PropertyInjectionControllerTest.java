package com.springdi.controllers;

import com.springdi.services.GreetingService;
import com.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp() {
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectionController.greetingService.sayGreeting());
        System.out.println(propertyInjectionController.sayHello());

    }
}