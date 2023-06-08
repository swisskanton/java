package com.timetable.controllers;

import com.timetable.services.CourseService;
import com.timetable.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final CourseService courseService;
    private final StudentService studentService;

    public HomeController(CourseService courseService, StudentService studentService) {
        this.courseService = courseService;
        this.studentService = studentService;
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/students")
    public String students(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students";
    }

    @RequestMapping("/courses")
    public String courses(Model model) {
        model.addAttribute("courses", courseService.findAll());
        return "courses";
    }
}
