package com.example.holamundo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HolaMundo {

    @GetMapping("/login")
    public String login(Model model) {
        return ("hola");
    }

   // @RequestMapping(value = "login", method = RequestMethod.GET)
   // public String login(Model model) {
   //     return ("hola");
   // }

    @PutMapping("/actualizar")
    public String actualizar(Model model) {
        return ("hola");
    }

    @PostMapping("/nuevo")
    public String nuevo(Model model) {
        return ("hola");
    }

    @DeleteMapping("/borrar/")
    public String borrar(Model model) {
        return ("hola");
    }


}
