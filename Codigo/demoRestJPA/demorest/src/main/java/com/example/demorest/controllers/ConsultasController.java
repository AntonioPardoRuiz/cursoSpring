package com.example.demorest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demorest.dao.ConsultasRepository;
import com.example.demorest.entity.Usuarios;

@RestController
@RequestMapping("/consultas")
public class ConsultasController {

	@Autowired
	private ConsultasRepository consultasRepository;

 	@CrossOrigin(origins= {"*"})
	//La ruta donde vamos acceder ahora http://..../users/lista
	//Recuperamos el listado de usuarios. Para comenzar trabajamos con este metodo
	@GetMapping("/lista")
	public ResponseEntity getConsultas() throws Exception, Throwable {
		return new ResponseEntity(consultasRepository.findAll(),HttpStatus.OK);
	}

    

}
