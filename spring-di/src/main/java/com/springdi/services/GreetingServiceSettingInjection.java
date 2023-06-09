package com.springdi.services;

import org.springframework.stereotype.Service;

@Service("settingGreetingBean")
public class GreetingServiceSettingInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from Greeting Service Setting Injection Bean";
    }
}
