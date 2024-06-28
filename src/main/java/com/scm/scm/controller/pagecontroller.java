package com.scm.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class pagecontroller {

    @RequestMapping("/home")
    public String home(Model model)
    {
        System.out.println("home is started");
        model.addAttribute("company", "Suma technologies");
        model.addAttribute("name", "prajawal");
        model.addAttribute("linkdin", "https://www.linkedin.com/in/prajawal-akare/");
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("about is started");
        return "about";
    }

    @RequestMapping("/service")
    public String service() {
        System.out.println("service is started");
        return "service";
    }
    
}