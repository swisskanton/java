package com.springdi.controllers;

import com.springdi.services.GreetingService;
import com.springdi.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller!");
        //return "Hello all!";
        return greetingService.sayGreeting();
    }
}
