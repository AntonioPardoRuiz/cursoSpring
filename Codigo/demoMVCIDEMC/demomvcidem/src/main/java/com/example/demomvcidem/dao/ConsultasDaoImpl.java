package com.example.demomvcidem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demomvcidem.entity.Consultas;
import com.example.demomvcidem.entity.Usuarios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class ConsultasDaoImpl implements IConsultasDao{
   
    /* */
       //Instanciamos el entity Manager
    @PersistenceContext
    private EntityManager  em;

    @Override
    @Transactional
     public List<Consultas> findAll() {
         return  em.createQuery("select c from Consultas c where c.id>0").getResultList();
     }
 
     @Override
     @Transactional
     public void save(Consultas consultas) {
           //Si el id existe 
         //en este caso sera una actualizacion 
         if (consultas.getId() != 0 && consultas.getId() > 0) {
             //Modificamos(Actualiza).
             em.merge(consultas);		
         }else {
             //Damos de alta->Crea un nuevo usuario.
             em.persist(consultas);			
         }
     }

    @Override
    public Consultas findOne(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }



}
