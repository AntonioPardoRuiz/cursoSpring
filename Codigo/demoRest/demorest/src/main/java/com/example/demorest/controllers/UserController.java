package com.example.demorest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demorest.dao.IUsuariosDao;

@RestController
@RequestMapping("/users")
public class UserController {

	private IUsuariosDao iUsuariosDao;
    /** Creamos el primer metodo que recupera todos los usuarios */

 	@CrossOrigin(origins= {"*"})
	//La ruta donde vamos acceder ahora http://..../users/lista
	//Recuperamos el listado de usuarios. Para comenzar trabajamos con este metodo
	@GetMapping("/lista")
	public ResponseEntity getUsuarios() throws Exception, Throwable {
		
		return new ResponseEntity(iUsuariosDao.findAll(),HttpStatus.OK);
	}



}
