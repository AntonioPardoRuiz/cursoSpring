package com.example.demo.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class RegisterController {
	
	/**
	 * Por inyeccion de dependencias enviamos el valor directamente con el interfaz
	 * @param model
	 * @return
	 */
	@Autowired
	private Ilogin ilogindao;
	// Register
	//Tenemos que dar de alta en el formulario el modelo de Login para pasarlo por el th:object. 
	//
	//Metodo de accion:Metodo del tipo get. Le damos un ruta de formuloria
	//Get se encarga de ver el formulario. 
	@RequestMapping(value="/register")
	public String register(Model model) {
		
		Login login = new Login();
        model.addAttribute("login", login);
		return "register";
	}

	/**
	 * Control de Registro.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String altaLogin(@Valid Login login, BindingResult result , Model model) {
		ilogindao.save(login);
		model.addAttribute("titulo","Confirmacion de Envio");
		model.addAttribute(login);
		//Una vez se ha hecho el registro, accedemos a la nueva ventana de aceptacion de registro para indicar
		// que se ha registrado de manera correcta.
        
		return "activated";
	}

}
