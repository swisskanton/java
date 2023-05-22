package com.example.firstjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
@EnableConfigurationProperties
@SpringBootApplication
public class FirstjavaApplication {

	public static void main(String[] args) {

		//SpringApplication.run(FirstjavaApplication.class, args);

		/*
		ApplicationContext ct =  SpringApplication.run(FirstjavaApplication.class, args);

		String[] beanArray = ct.getBeanDefinitionNames();
		Arrays.sort(beanArray);

		for (String name: beanArray) {
			System.out.printf(name);
		}*/

		ApplicationContext ct = SpringApplication.run(FirstjavaApplication.class, args);
		System.out.println(ct.getBean("person"));
	}

}
