package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.Icontact;
import com.example.demo.entity.Contacto;
import com.example.demo.entity.Login;

@Controller
public class ContactoController {
	@Autowired
	private Icontact icontact;
	
	@GetMapping("/contacto")
	public String contacto(Model model) {
		//Instanciamos contacto y se lo enviamos al modelo
		Contacto contacto = new Contacto();
		model.addAttribute("contacto", contacto);
		
		return("contacto");
	}


	@RequestMapping(value="/contacto", method=RequestMethod.POST)
	public String altaLogin(@Valid Contacto contact, BindingResult result , Model model) {
		icontact.save(contact);
		model.addAttribute("titulo","Confirmacion de Envio");
		model.addAttribute(contact);
		//Vamos a la ventana de aceptacion, que permite al usuario volver a menu 
		// o pagar la licencia. 

        
		return "accept";
	}


}
