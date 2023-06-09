package com.springdi;

import com.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In Main method");

        System.out.println(controller.sayHello());
    }

}
