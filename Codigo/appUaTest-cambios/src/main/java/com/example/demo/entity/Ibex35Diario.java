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
@Table(name = "ibex35diario")
public class Ibex35Diario implements Serializable {
	/**
	 * Defino la estructura de datos que tiene la tabla. 
	 */
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	
	@NotEmpty
	private Float valorfinal;
	
	@NotEmpty
	private Float open;
	
	@NotEmpty
	private Float max;
	
	@NotEmpty
	private Float min;
	
	@NotEmpty
	private Float vol;
	
	@NotEmpty
	private Float var;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createDate;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date modificationDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getValorfinal() {
		return valorfinal;
	}

	public void setValorfinal(Float valorfinal) {
		this.valorfinal = valorfinal;
	}

	public Float getOpen() {
		return open;
	}

	public void setOpen(Float open) {
		this.open = open;
	}

	public Float getMax() {
		return max;
	}

	public void setMax(Float max) {
		this.max = max;
	}

	public Float getMin() {
		return min;
	}

	public void setMin(Float min) {
		this.min = min;
	}

	public Float getVol() {
		return vol;
	}

	public void setVol(Float vol) {
		this.vol = vol;
	}

	public Float getVar() {
		return var;
	}

	public void setVar(Float var) {
		this.var = var;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	

}
