package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Ibex35Diario;

public interface Iibex35diario {
	
	/**
	 * Implementamos los metodos que va implementar nuestra clase DAO. 
	 */
	    //Recuperamos los campos del login
		public List<Ibex35Diario> findAll();
		//Si nos registraramos en la aplicacion. 
		public void save(Ibex35Diario field);
		//Recuperamos el campo por el id. 
		public Ibex35Diario findOne(Long id);
		//Borrado del usuario.
		public void delete(Long id);

}
