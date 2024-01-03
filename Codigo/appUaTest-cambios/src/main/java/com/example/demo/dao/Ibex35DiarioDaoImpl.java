package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ibex35Diario;
import com.example.demo.entity.Login;

@Repository
public class Ibex35DiarioDaoImpl implements Iibex35diario {
	
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Ibex35Diario> findAll() {
		return  em.createQuery("from Ibex35Diario").getResultList();
	}
	@Override
	public void save(Ibex35Diario field) {
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
	public Ibex35Diario findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		//Recuperamos el objeto a partir del id
		Ibex35Diario ibex = findOne(id);
		
		em.remove(ibex);

	}

}
