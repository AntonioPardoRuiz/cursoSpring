package com.example.demomvcidem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demomvcidem.dao.IUsuarioDao;
import com.example.demomvcidem.entity.Usuarios;

/**
 * En este controlador lo que realizaremos sera recibir las peticiones propias del menu de registro. 
 *
 */
@Controller
public class RegisterController {
    //Inyectamos
    @Autowired
    private IUsuarioDao usuariosDao;

 	//Metodo de accion:Metodo del tipo get. Le damos un ruta de formuloria
	//Get se encarga de ver el formulario. 
	@RequestMapping(value="/register")
	public String register(Model model) {
        //Añadimos los datos del modelo, en este caso tendremos que cargar nuestro modelo de Usuarios
		Usuarios usuario = new Usuarios();
        model.addAttribute("usuario", usuario);
		return "register";
	}

	/**
	 * Control de Registro.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String altaUsuario(@Validated Usuarios usuario, BindingResult result , Model model) {
        //Realizamos el alta.
		usuariosDao.save(usuario);
		model.addAttribute(usuario);
		return "login";
	}   

}
