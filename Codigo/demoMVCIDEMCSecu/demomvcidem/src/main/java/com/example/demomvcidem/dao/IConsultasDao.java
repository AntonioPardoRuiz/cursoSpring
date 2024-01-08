package com.example.demomvcidem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demomvcidem.entity.Consultas;
/** Para esta tabla trabajaremos con el CRUD REPOSITORY */

public interface IConsultasDao {
    
        public List<Consultas> findAll();
     //Guardamos la consulta en la base de datos. 
        public void save(Consultas consultas);
    //   Recuperamos el campo por el id. 
        public Consultas findOne(Long id);
        //Borrado del usuario.
        public void delete(Long id);

}
