package com.example.demo.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//Para el encriptar

import com.example.demo.dao.Ilogin;
import com.example.demo.entity.Login;

/**
 * Controlador inicial de la aplicacion
 * 
 * @author anton
 *
 */
@Controller
public class LoginController {
	
	/**
	 * Por inyeccion de dependencias enviamos el valor directamente con el interfaz
	 * @param model
	 * @return
	 */
	@Autowired
	private Ilogin ilogindao;

	// Metodo del controlador
	@GetMapping("/login")
	public String login(Model model) {
		// En el caso de que ya haya iniciado sesion y no vuelva a iniciar Sesion
		// Si existe algun tipo de error, puede redirigir directamente.
		

		return ("login");
	}

	// Metodo post cuando sha puesto las credenciales de manera correcta para poder
	// acceder al menu.
	@PostMapping("/login")
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


}
