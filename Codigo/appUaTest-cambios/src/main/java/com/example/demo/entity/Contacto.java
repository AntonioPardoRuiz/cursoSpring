package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * Entidad para la comunicacion por Hibernate del proceso. 
 * Tabla Login
 * @author Antonio Miguel Pardo Ruiz
 *
 */
@Entity
@Table(name = "contact")
public class Contacto {
	
	//Definimos las variables de la base de datos. Y luego implementamos sus getters&Setters
	//El campo clave va a ser el campo id de la tabla. 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String name;
	@NotEmpty
	private String email;
	@NotEmpty
	private String phone;
	@NotEmpty
	private String country;
	@NotEmpty
	private String city;
	@NotEmpty
	private String address;
	@NotEmpty
	private String contactType;
	private int checked;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date  createDate;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date  modificationDate;
	
	/**
	 * GETTERS AND SETTERS
	 * DE CONTACT
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
	}
	public Date getCreateDate() {
		Date objDate = new Date();
		return createDate = objDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModificationDate() {
		Date objDate = new Date();
		return modificationDate = objDate;
	}
	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	


	
	



}
