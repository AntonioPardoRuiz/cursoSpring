package com.example.demomvcidem.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler()
    public String generalError(Exception ex, Model model){


        model.addAttribute("error", "Error en el proceso");
        model.addAttribute("message", ex.getMessage());
        //Enviamos el tipo de error del servidor
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("date", new Date().toString());

        return("error");
    
    }

}
