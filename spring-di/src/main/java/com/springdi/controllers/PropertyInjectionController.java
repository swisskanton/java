package com.springdi.controllers;

import com.springdi.services.GreetingService;

public class PropertyInjectionController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
