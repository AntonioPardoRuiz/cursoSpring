package com.example.demorest.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demorest.entity.Consultas;

public interface ConsultasRepository extends CrudRepository<Consultas, Integer> {

    List<Consultas> findAll();

}
