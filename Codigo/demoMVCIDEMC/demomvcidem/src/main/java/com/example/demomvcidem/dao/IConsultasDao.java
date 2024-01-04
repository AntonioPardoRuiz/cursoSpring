package com.example.demomvcidem.dao;

import java.util.List;

import com.example.demomvcidem.entity.Consultas;

public interface IConsultasDao {

    //Recuperamos el listado de consultas
    public List<Consultas> findAll();
    //Guardamos la consulta en la base de datos. 
    public void save(Consultas consultas);
    //Recuperamos el campo por el id. 
	public Consultas findOne(Long id);
	//Borrado del usuario.
	public void delete(Long id);


}
