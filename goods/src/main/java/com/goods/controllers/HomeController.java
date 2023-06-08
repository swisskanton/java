package com.goods.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/subcategory")
    public String subcategories() {
        return "categories";
    }

    @RequestMapping("/subcategory/{id}")
    public String item(@PathVariable(value = "id") String id) {
        return "goods";
    }
}
