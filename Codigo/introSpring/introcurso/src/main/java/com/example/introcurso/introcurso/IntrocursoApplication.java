package com.example.introcurso.introcurso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntrocursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntrocursoApplication.class, args);
		System.out.println("Arranque de la aplicacion");
		System.out.println("El servidor se reinicia de manera automatica");
	}

}
