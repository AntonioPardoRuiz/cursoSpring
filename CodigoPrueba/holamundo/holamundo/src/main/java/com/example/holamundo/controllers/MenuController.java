package com.example.holamundo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

  
    @GetMapping("/menu")
    public String menu(Model model){
        return("menu");
    }

    

}
