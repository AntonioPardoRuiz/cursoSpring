package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Librerias para la validacion
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;




import javax.validation.constraints.Size;
//Formato fecha
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "login")
public class Login implements Serializable {
	/**
	 * Defino la estructura de datos que tiene la tabla. 
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Email
	private String email;
	
	private String password;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String surname;
	
	private int birthdate;
	
	private String level;
	
	@NotEmpty
	private String country;
	
	@NotEmpty
	private String identification;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createDate;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date modificationDate;
	
	/**
	 * Generamos los getters and Setters que se
	 * configuran en el proyecto.
	 * @return
	 */
	public int getId() {
		System.out.println("El retorno de id es:"+id);
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(int birthdate) {
		this.birthdate = birthdate;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public Date getCreateDate() {
		//Añadimos la fecha del dia para mapearlo de manera directa en la bbdd
		Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate  
		return createDate= objDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModificationDate() {
		Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate  
		return modificationDate = objDate;
	}
	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	

}
