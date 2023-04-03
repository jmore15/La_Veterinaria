package com.Veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ClienteController {
    
    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("attribute", "value");
        return "view.name";
    }
    
}
