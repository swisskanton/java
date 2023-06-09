package com.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("prod") // Production
@Service("environmentService")
public class EnvironmentServiceProd implements EnvironmentService{
    @Override
    public String getEnv() {
        return "prod";
    }
}
