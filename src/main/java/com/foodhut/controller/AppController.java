package com.foodhut.controller;

import com.foodhut.model.Student;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    @RequestMapping("/port")
    public String welcomeMethod(Model model) {
        model.addAttribute("Ref", new Student()); // Make sure this matches JSP
        return "portal";
    }

    @RequestMapping(value = "/wel", method = RequestMethod.POST)
    public String processForm(@Valid @ModelAttribute("Ref") Student student,
                              BindingResult result) {
        if (result.hasErrors()) {
            return "portal";
        }
        return "welcome";
    }


}