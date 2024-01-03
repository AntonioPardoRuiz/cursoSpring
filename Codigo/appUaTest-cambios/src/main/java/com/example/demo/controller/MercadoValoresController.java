package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.Iibex35diario;
import com.example.demo.entity.*;

@Controller
public class MercadoValoresController {
	
	//Importamos la interfaz de los atributos DAO
	@Autowired
	private Iibex35diario ibex35;
	

	/**Listaremos los datos que nos da la tabla Ibex35Diario
	 */
	@RequestMapping(value="mercadoValores", method=RequestMethod.GET)
	public String listarDiario(Model model){
		//Paso el listado en el get de los datos recuperados Ibex35diario
		model.addAttribute("ibex35diario",ibex35.findAll());
		
		
		
		
		return("mercadoValores");
		
	}
	

}
