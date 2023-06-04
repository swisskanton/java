package com.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstprojectApplication {
/*
	@RequestMapping("/")
	public String index() {
		return "Hello all!";
	}
*/
	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
}
