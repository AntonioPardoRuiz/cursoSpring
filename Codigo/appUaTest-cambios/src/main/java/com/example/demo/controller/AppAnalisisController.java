package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//Importamos el dao para la comunicacion con ibex35
import com.example.demo.dao.Iibex35diario;

@Controller
public class AppAnalisisController {

	//Importamos la interfaz de los atributos DAO
	@Autowired
	private Iibex35diario ibex35;
	
	@GetMapping("/analisis")
	public String getAnalisis(Model model) {
		// En el caso de que ya haya iniciado sesion y no vuelva a iniciar Sesion
		// Si existe algun tipo de error, puede redirigir directamente.
				//Paso el listado en el get de los datos recuperados Ibex35diario
		model.addAttribute("ibex35diario",ibex35.findAll());

		return ("analisis");
	}
	

}