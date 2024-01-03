package com.example.demomvc.demomvc.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

import com.example.demomvc.demomvc.entities.Seguros;
import com.example.demomvc.demomvc.entities.Users;


@Controller
@RequestMapping("/")
public class UserController {
    //Definimos las variables que recibiremos.Por ahor no las usaremos.
    private String email;
    private String password;
    private HashMap<String,String> usuarios;

      /* Metodo que realiza la recepcion de datos desde la vista */
    @GetMapping("/login")
    public String login(@RequestParam(name="email",required=false) String email, @RequestParam(name="password",required=false) String password)
    {
        //Recibiremos tanto un email y un password de un formulario de Thymleaf.
         System.out.println("email:"+ email);
         System.out.println("Password:"+password);
         //Guardamos los datos en el objeto
         Users users = new Users();
         if(email!=null && password!=null){
            users.setEmail(email);
            users.setPassword(password);
            System.out.println("El valor es del correo es:"+users.getEmail());
            return"redirect:/menu/"+email;

         }
         return("login");

    }

    //Ejemplo para trabajar con @PathVariable
/*     @GetMapping("/menu/{email}")
    public String menu (@PathVariable String email)
    {
        //Model&View
        //Definimos un hasmap en el proceso
        System.out.println("Vista Menu");
        System.out.println("email:"+email);
        ModelAndView modelAndView = new ModelAndView();
        //Recuperamos un map.
        modelAndView.setViewName("menu"); // Nombre de la vista paginaDestino.jsp, por ejemplo            
        //Fin del proceso.
        return("menu");

    }
   */
    @GetMapping("/menu/{email}")
    public String menu (@PathVariable String email, Model model)
    {
    
    //Definimos nuestro array de seguros
        ArrayList<Seguros> seguros = new ArrayList();
        seguros.add(0, new Seguros(1,"Mapfre"));
        seguros.add(1,new Seguros(2,"Sanitas"));

        //Añadimos los datos al arrayList
    
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("email", email);
        //Añadimos al modele los datos.
        model.addAttribute("seguros", seguros);
        //Recuperamos un map.
        modelAndView.setViewName("menu"); // Nombre de la vista paginaDestino.jsp, por ejemplo  
        //Fin del proceso.
        return("menu");

    }

    /* Metodo que realiza la recepcion de datos desde la vista */
    @GetMapping("/register")
    public String register()
    {

        return("register");

    }
}
