package com.example.demomvcidem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demomvcidem.dao.IConsultasDao;
import com.example.demomvcidem.entity.Consultas;
import com.example.demomvcidem.entity.Usuarios;

@Controller
public class ConsultaController {

    @Autowired
    private  IConsultasDao iconsultasdao;
    List<Consultas> consultasList;
    

    @RequestMapping(value="/consultas", method = RequestMethod.GET)
    public String consultas(Model model){
        
        consultasList = iconsultasdao.findAll();
        //Añadimos los datos del modelo, en este caso tendremos que cargar nuestro modelo de Usuarios
        Consultas consultas = new Consultas();

        if(consultasList!=null){
            System.out.println("Tiene array");
            //Si ya tenemos datos cargamos la primera vez
            model.addAttribute("consultasList", consultasList);
            model.addAttribute("consultas", consultas);
        }else{
            //En el caso de que no tengamos datos tenemos que mover los parametros al modelo si no dara error.

            System.out.println(" No tiene array");
            model.addAttribute("consultasList", consultasList);
            model.addAttribute("consultas", consultas);
        }
		return "consultas";
    }

	@RequestMapping(value="/consultas", method=RequestMethod.DELETE)
	public String consultasDelete(@Validated Consultas consultas, Model model) {
        //Realizamos la baja.
	//	iconsultasdao.delete(consultas.getId());
		model.addAttribute(consultas); 
		return ("consultas");
	}


	@RequestMapping(value="/consultas", method=RequestMethod.POST)
	public String altaConsultas(@Validated Consultas consultas, BindingResult result , Model model) {
        //Realizamos el alta.
        //Añadimos la fecha del dia. en Java
	    iconsultasdao.save(consultas);
        //Añadimos en el objeto para recuperarlo al inicio del get. 
        consultasList.add(consultas);
		return "consultasList";
	}
}
