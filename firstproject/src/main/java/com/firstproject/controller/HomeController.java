package com.firstproject.controller;

import com.firstproject.domain.Blogger;
import com.firstproject.repository.StoryRepository;
import com.firstproject.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.firstproject.domain.Story;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {

    private StoryService storyService;

    @Autowired
    public void setStoryService(StoryService storyService) {
        this.storyService = storyService;
    }
    @RequestMapping("/")
    public String stories(Model model, Locale locale) {
        model.addAttribute("pageTitle", "Daily stiries");
        model.addAttribute("stories", storyService.getStories());
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

    /*private ArrayList<Story> getStories() {

        ArrayList<Story> stories = new ArrayList<>();
        Story story1 = new Story("First story", "<p>First story content<p>", new Date(), new Blogger(1, "John Doe", 28));
        stories.add(story1);
        Story story2 = new Story("Second story", "<p>Second story content<p>", new Date(), new Blogger(2, "Jane Doe", 24));
        stories.add(story2);
        return stories;
    }*/
}
