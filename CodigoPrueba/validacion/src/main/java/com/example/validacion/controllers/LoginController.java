package com.example.validacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.validacion.entitys.Login;

//Libreria para validacion.
import jakarta.validation.Valid;

@Controller
public class LoginController {

    @GetMapping("/")
    public String cargarLogin(Login login){
        return("inicio");
    }

    @PostMapping("/")
    public String validaLogin(@Valid Login login, BindingResult result, Model model){
        if(result.hasErrors()){
            return("inicio");
        }

        return "correcto";
    }

}
