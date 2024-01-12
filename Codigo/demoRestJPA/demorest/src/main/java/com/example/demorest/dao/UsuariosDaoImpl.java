package com.example.demorest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demorest.entity.Usuarios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class UsuariosDaoImpl implements IUsuariosDao {
    //Instanciamos el entity Manager
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public List<Usuarios> findAll() {
        //Recordar que no se pone el nombre de la tabla sino el objeto.
        return  em.createQuery("SELECT u FROM Usuarios u WHERE u.id > 0").getResultList();
    }

    @Override
    @Transactional
    public Usuarios save(Usuarios usuario) {
    
		if (usuario.getId() != 0 && usuario.getId() > 0) {
			//Modificamos(Actualiza).
			em.merge(usuario);	
		}else{
			//Damos de alta->Crea un nuevo usuario.
			em.persist(usuario);			
		}
        return usuario;
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
