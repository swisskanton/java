package com.example.firstjava.controler;

import com.example.firstjava.service.SpyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {

    private SpyService spyService;

    @Autowired
    public void setSpyService(SpyService spyService) {
        this.spyService = spyService;
    }

    @RequestMapping("/spy")
    public String spy() {
        return this.spyService.iSaySomething();
    }

    @RequestMapping("/")
    public String index() {
        return "Hello all!";
    }
}
