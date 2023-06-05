package com.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.firstproject.domain.Story;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String stories(Model model, Locale locale) {
        model.addAttribute("pageTitle", "Daily stiries");
        model.addAttribute("stories", getStories());
        System.out.println(String.format("Request received language: %s, Country: %s %n", locale.getLanguage(), locale.getDisplayCountry()));
        return "stories";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/user/{id}")
    public String sertchForUser(@PathVariable(value = "id") String id) throws Exception {
        if (id == null)
            throw new Exception("There is no user with the given ID");
        return "index"; // --> "user"
    }
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception ex, Model model) {
        model.addAttribute("exception", ex.getMessage());
        return "exceptionHandlersPage";
    }

    private ArrayList<Story> getStories() {
        ArrayList<Story> stories = new ArrayList<>();

        Story story1 = new Story("First story", "<p>First story content<p>", new Date(), "John Doe");
        stories.add(story1);

        Story story2 = new Story("Second story", "<p>Second story content<p>", new Date(), "Jane Doe");
        stories.add(story2);

        return stories;
    }
}
