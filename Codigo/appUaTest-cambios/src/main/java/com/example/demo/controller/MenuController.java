package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
	
	@GetMapping("/menu")
	public String menu(Model model) {
		// En el caso de que ya haya iniciado sesion y no vuelva a iniciar Sesion
		// Si existe algun tipo de error, puede redirigir directamente.

		return ("menu");
	}
	

}
