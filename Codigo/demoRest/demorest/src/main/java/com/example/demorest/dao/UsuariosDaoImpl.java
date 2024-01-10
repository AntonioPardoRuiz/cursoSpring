package com.example.demorest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demorest.entity.Usuarios;

import jakarta.persistence.EntityManager;

@Repository
public class UsuariosDaoImpl implements IUsuariosDao {

    private EntityManager em;
    
    @Override
    public List<Usuarios> findAll() {
        return  em.createQuery("from usuarios").getResultList();
    }

    @Override
    public void save(Usuarios usuario) {
    
		if (usuario.getId() != 0 && usuario.getId() > 0) {
			//Modificamos(Actualiza).
			em.merge(usuario);		
		}else {
			//Damos de alta->Crea un nuevo usuario.
			em.persist(usuario);			
		}
    }

    @Override
    public Usuarios findOne(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public void delete(int id) {
        Usuarios usuario = findOne(id);
		em.remove(usuario);
    }



}
