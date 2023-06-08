package com.goods.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        return "subcategory";
    }

    @RequestMapping("/subcategory/{id}")
    public String item(@PathVariable(value = "id") String id, Model model) {
        model.addAttribute("id", id);
        return "goods";
    }
}
