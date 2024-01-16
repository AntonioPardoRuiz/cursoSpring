package com.example.demomvcidem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demomvcidem.dao.IUsuarioDao;

@Controller
public class LoginController {

    @Autowired
    private IUsuarioDao usuarioDao;

    // Inicio del Login.
	@GetMapping("/")
	public String login(Model model) {
		// En el caso de que ya haya iniciado sesion y no vuelva a iniciar Sesion
		// Si existe algun tipo de error, puede redirigir directamente.
		return ("login");
	}

	@PostMapping("/")
	public String loginPost(@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password, Model model) {
		// Recibimos las variables mediante post tanto del usuario como del
		// password.Mediante @RequestParam como podemos observar.
		System.out.println("El valor del mail es:" + email);
		System.out.println("El valor del password es:" + password);
		//Aqui validamos con la base de datos por si existe.
		//para este proceso unicamente, vamos a setear los valores y darlos de alta en la tabla login. 
		return ("menu");
	}

	//Definimos la ruta del logout.
	@GetMapping("/logout")
	public String logout(){
		return "login";
	}
    
}
