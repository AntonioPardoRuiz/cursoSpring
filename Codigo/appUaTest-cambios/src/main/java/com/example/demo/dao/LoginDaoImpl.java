package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Login;

@Repository
public class LoginDaoImpl implements Ilogin {
	
	@PersistenceContext
	private EntityManager em;

	/**
	 * FINDALL
	 * Encuentra el listado de todos los logins de la base de datos.
	 */
	@Override
	public List<Login> findAll() {
		// TODO Auto-generated method stub
		return  em.createQuery("from Login").getResultList();
	}
	
	/**
	 * SAVE
	 * Escribe en la base de datos el nuevo usuario
	 */
	@Transactional
	@Override
	public void save(Login field) {
		//Ahora si comparamos si es una modificacion o una alta nueva. 
		//Si el id existe 
		//en este caso sera una modificacion. 
		if (field.getId() != 0 && field.getId() > 0) {
			//Modificamos(Actualiza).
			em.merge(field);		
		}else {
			//Damos de alta->Crea un nuevo cliente.
			em.persist(field);			
		}
		
		
	}

	@Override
	public Login findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
    /**
     * DELETE
     */
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//Recuperamos el objeto a partir del id
		Login login = findOne(id);
		
		em.remove(login);
		
	}
	
	

}
