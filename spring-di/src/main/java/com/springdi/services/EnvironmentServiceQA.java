package com.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa") // Quality Assurance
@Service("environmentService")
public class EnvironmentServiceQA implements EnvironmentService{
    @Override
    public String getEnv() {
        return "qa";
    }
}
