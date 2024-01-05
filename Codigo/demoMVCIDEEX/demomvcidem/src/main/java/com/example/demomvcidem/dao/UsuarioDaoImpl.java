package com.example.demomvcidem.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demomvcidem.entity.Usuarios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class UsuarioDaoImpl implements IUsuarioDao {

    //Instanciamos el entity Manager
    @PersistenceContext
    private EntityManager  em;

    /** Recuperamos todos los usuarios */
    @Override
    public List<Usuarios> findAll() {
        return  em.createQuery("from usuarios").getResultList();
    }

    @Override
    @Transactional
    public void save(Usuarios usuario) {
        //Si el id existe 
		//en este caso sera una actualizacion 
		if (usuario.getId() != 0 && usuario.getId() > 0) {
			//Modificamos(Actualiza).
			em.merge(usuario);		
		}else {
			//Damos de alta->Crea un nuevo usuario.
			em.persist(usuario);			
		}
    }

    @Override
    public void delete(Long id) {
        
        Usuarios usuario = findOne(id);
		em.remove(usuario);
    }

    @Override
    public Usuarios findOne(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }





}
