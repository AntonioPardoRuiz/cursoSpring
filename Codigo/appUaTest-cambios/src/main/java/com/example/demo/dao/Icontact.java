package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Contacto;

/**
 * Iplementamos los metodos Crud
 * de la tabla CONTACT
 * @author anton
 *
 */
public interface Icontact {
	/**
	 * Implementamos los metodos que va implementar nuestra clase DAO. 
	 */
	    //Recuperamos los campos del contacto
		public List<Contacto> findAll();
		//Si nos registraramos en la aplicacion. 
		public Contacto save(Contacto contacto);
		//Recuperamos el campo por el id. 
		public Contacto findOne(Long id);
		//Borrado del contacto
		public void delete(Long id);
	
	

}
