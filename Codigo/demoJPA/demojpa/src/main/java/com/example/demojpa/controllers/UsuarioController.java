package com.example.demojpa.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demojpa.dao.IUsuarioDao;
import com.example.demojpa.entity.Usuarios;


@Controller
public class UsuarioController {
    //Definimos las variables que recibiremos.Por ahor no las usaremos.

    @Autowired
    private IUsuarioDao usuariosDao;
    
    private String email;
    private String password;
    
      /* Metodo que realiza la recepcion de datos desde la vista */	
  @RequestMapping(value = "/login", method = RequestMethod.GET)
	public String l(Model model) {
		model.addAttribute("titulo", "Listado de clientes");
		model.addAttribute("usuarios", usuariosDao.findAll());
		return "login";
	}

}
