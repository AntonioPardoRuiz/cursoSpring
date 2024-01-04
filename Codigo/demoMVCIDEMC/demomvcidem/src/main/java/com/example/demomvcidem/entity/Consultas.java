package com.example.demomvcidem.entity;

import java.io.Serializable;
import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.validation.constraints.NotEmpty;


@Entity
@Table(name="consultas")
public class Consultas implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String detalle;
    private String nombre;
    private String apellido;
    private int edad;
    private Date fechaconsulta;

     /** Generar los Getter and Setters */

    public int  getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetalle() {
        return this.detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Date getFechaconsulta() {
        return this.fechaconsulta;
    }

    public void setFechaconsulta(Date fechaconsulta) {
        this.fechaconsulta = fechaconsulta;
    }

}
