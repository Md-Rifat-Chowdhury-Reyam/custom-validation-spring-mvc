package com.foodhut.controller;

import com.foodhut.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class AppController {

    @RequestMapping("/studentportal")
    public String welcomeMethod(Model model)
    {
        Student student = new Student();
        model.addAttribute("studentRef", student);
        return "portal";
    }

    @RequestMapping("/wel")
    public String portalMethod(@Valid @ModelAttribute("studentRef") Student student, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "portal";
        }
        else {
            return "welcome";
        }
    }
}
