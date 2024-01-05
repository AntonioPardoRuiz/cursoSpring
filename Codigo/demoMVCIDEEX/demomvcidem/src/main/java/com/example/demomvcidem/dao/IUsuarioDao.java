package com.example.demomvcidem.dao;

import java.util.List;

import com.example.demomvcidem.entity.Usuarios;

public interface IUsuarioDao {

    //En la interface diseñamos el crud neceario para acceder a la tabla

    //Recuperamos el listado de usuarios
    public List<Usuarios> findAll();
    //Guardamos el usuario en la base de datos. 
    public void save(Usuarios usuario);
    //Recuperamos el campo por el id. 
	public Usuarios findOne(Long id);
	//Borrado del usuario.
	public void delete(Long id);


}
