package com.example.demo.dao;

import java.util.List;

//importamos el entity manager
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
//Cargamos la libreria de entitys
import com.example.demo.entity.Contacto;

import org.springframework.stereotype.Repository;


@Repository
public class ContactDaoImpl implements Icontact {
	
	@PersistenceContext
	private EntityManager em;


	@Override
	public List<Contacto> findAll() {
		return  em.createQuery("from Contact").getResultList();
   
	}
	
	@Transactional
	@Override
	public Contacto save(Contacto contact) {
	
	//Validamos que viene informado el contacto. Si viene informado, actualizamos 
		
	if ( contact.getId() != 0 && contact.getId() > 0 ) {
		//Actualizmaos y enviamos el retorno del objeto
		em.merge(contact);
		return contact;
		
	}else {
		//Es nuevo por lo que lo damos de alta.
		em.persist(contact);
		return contact;	
	}
			
		
	}
	@Override
	public Contacto findOne(Long id) {
		
		return null;
	} 

	@Override
	public void delete(Long id) {
		//Para el borrado lo que se realiza es recuperar el objeto.
		Contacto contact = findOne(id);
		//Damos de baja el contacto
		em.remove(contact);
		
	}
	

}
