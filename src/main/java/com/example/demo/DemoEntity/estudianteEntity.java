package com.example.demo.DemoEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="estudiante")
public class estudianteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestudiante;
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private Integer dni;
    private Integer edad;
    private LocalDate nacimiento;

    public Integer getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
}
