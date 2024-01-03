package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Login;

public interface Ilogin {

	/**
	 * Implementamos los metodos que va implementar nuestra clase DAO. 
	 */
	    //Recuperamos los campos del login
		public List<Login> findAll();
		//Si nos registraramos en la aplicacion. 
		public void save(Login field);
		//Recuperamos el campo por el id. 
		public Login findOne(Long id);
		//Borrado del usuario.
		public void delete(Long id);


}
