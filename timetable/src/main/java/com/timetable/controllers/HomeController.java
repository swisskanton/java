package com.timetable.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/students")
    public String students() {
        return "students";
    }

    @RequestMapping("/courses")
    public String courses() {
        return "courses";
    }
}
