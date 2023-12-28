package com.example.demomvc.demomvc.controllers;

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

import com.example.demomvc.demomvc.models.Users;


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
    public String menu (@PathVariable String email)
    {
        //Model&View
        System.out.println("Vista Menu");
        System.out.println("email:"+email);
        //Pasamos los datos del controlador al modelo.
       // model.addAttribute("email", email);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("email", email);
        //Recuperamos un map.
        modelAndView.setViewName("menu"); // Nombre de la vista paginaDestino.jsp, por ejemplo  
        //Fin del proceso.
        return("menu");

    }
}
