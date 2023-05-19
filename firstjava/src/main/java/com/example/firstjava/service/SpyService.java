package com.example.firstjava.service;

import org.springframework.stereotype.Service;

@Service("spying")
public class SpyService {

    public String iSaySomething() {
        return "I am a spy girl.";
    }
}
