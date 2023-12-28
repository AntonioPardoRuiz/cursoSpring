package com.example.demomvc.demomvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UserController {
    //Definimos las variables que recibiremos.Por ahor no las usaremos.
    private String usuario;
    private String password;

    /* Metodo que realiza la recepcion de datos desde la vista */
    @GetMapping("/login")
    public String login(Model model){ 
        //Recibiremos tanto un email y un password de un formulario de Thymleaf.
         model.addAttribute("email","antoniomiguelpardoruiz@gmail");
         model.addAttribute("password", "123456");
         
         return("login");

    }
}
