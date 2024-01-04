package com.example.demomvcidem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demomvcidem.dao.IConsultasDao;
import com.example.demomvcidem.entity.Consultas;
import com.example.demomvcidem.entity.Usuarios;

@Controller
public class ConsultaController {

    @Autowired
    private  IConsultasDao iconsultasdao;

 
    @RequestMapping(value="/consultas", method = RequestMethod.GET)
    public String consultas(Model model){
        //Añadimos los datos del modelo, en este caso tendremos que cargar nuestro modelo de Usuarios
		Consultas consultas = new Consultas();
        //Recuperamos todas las consultas dadas de altas, para pasarlas al modelo, como consultas, lo añado dentro de un List de Consultas
        model.addAttribute("consultas", consultas);

		return "consultas";
    }

	@RequestMapping(value="/consultas", method=RequestMethod.DELETE)
	public String consultasDelete(@Validated Consultas consultas, Model model) {
        //Realizamos la baja.
		iconsultasdao.delete(consultas.getId());
		model.addAttribute(consultas); 
		return ("consultas");
	}


	@RequestMapping(value="/consultas", method=RequestMethod.POST)
	public String altaConsultas(@Validated Consultas consultas, BindingResult result , Model model) {
        //Realizamos el alta.

		iconsultasdao.save(consultas);
		model.addAttribute(consultas);
		return "consultas";
	} 








}
