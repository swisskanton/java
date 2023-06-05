package com.firstproject.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExeptionGeneral {

    @ExceptionHandler
    public String exceptionHandler(Exception ex, Model model) {
        model.addAttribute("exception", ex.getMessage());
        return "exceptionHandlersPage";
    }
}
