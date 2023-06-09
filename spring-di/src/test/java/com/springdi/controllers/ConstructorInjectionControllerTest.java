package com.springdi.controllers;

import com.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectionControllerTest {

    @Autowired
    ConstructorInjectionController constructorInjectionController;
    /*@BeforeEach
    void setUp() {
        constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());

    }*/

    @Test
    void sayHello() {
        System.out.println(constructorInjectionController.sayHello());
    }
}