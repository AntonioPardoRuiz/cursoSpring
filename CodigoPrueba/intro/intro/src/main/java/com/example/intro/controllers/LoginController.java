package com.example.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController{

    @GetMapping("/holamundo")
    public String login(Model model){

        return "login" ;
    }

    @GetMapping("/adios")
    public String prueba(Model model){

        return "prueba";
    }



}
