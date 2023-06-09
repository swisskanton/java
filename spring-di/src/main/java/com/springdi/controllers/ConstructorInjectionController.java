package com.springdi.controllers;

import com.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
