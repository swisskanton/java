package com.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("uat") // User Acceptance Testing
@Service("environmentService")
public class EnvironmentServiceUAT implements EnvironmentService{
    @Override
    public String getEnv() {
        return "uat";
    }
}
