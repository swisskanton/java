package com.springdi.controllers;

import com.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectionControllerTest {

    @Autowired
    SetterInjectionController setterInjectionController;
    /*@BeforeEach
    void setUp() {
        setterInjectionController = new SetterInjectionController();
        //setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }*/

    @Test
    void sayHello() {
        System.out.println(setterInjectionController.sayHello());
    }
}