package com.springdi.services;

import org.springframework.stereotype.Service;


@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello friends from property intection!";
    }
}
