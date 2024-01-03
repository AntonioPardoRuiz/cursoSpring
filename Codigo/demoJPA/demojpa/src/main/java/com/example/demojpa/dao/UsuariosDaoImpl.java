package com.example.demojpa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demojpa.entity.Usuarios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@Repository
public class UsuariosDaoImpl implements IUsuarioDao {
    
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public List<Usuarios> findAll() {

        return em.createQuery("from usuario").getResultList();
    }

}
