package com.example.demojpa.dao;

import java.util.List;

import com.example.demojpa.entity.Usuarios;

public interface IUsuarioDao {

    //Generamos los metoos de acceso que estaran dentro del proceso.

    //Encontramos todos los usuarios.
    public List<Usuarios> findAll();

}
