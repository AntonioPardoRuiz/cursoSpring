package com.example.demorest.dao;

import java.util.List;

import com.example.demorest.entity.Usuarios;

public interface IUsuariosDao {

    //Definimos en la interface los métodos

    //Recuperamos el listado de usuarios
    public List<Usuarios> findAll();
    //Guardamos el usuario en la base de datos. 
    public void save(Usuarios usuario);
    //Recuperamos el campo por el id. 
	public Usuarios findOne(int id);
	//Borrado del usuario.
	public void delete(int  id);

} 

