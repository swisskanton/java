package com.springdi.controllers;

import com.springdi.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvvironment() {
        return "You are in " + environmentService.getEnv() + " environment.";
    }
}
