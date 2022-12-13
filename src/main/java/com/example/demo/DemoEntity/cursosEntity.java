package com.example.demo.DemoEntity;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="cursos")
public class cursosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcurso;
    private String nombcurso;
    private Integer creditos;

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getNombcurso() {
        return nombcurso;
    }

    public void setNombcurso(String nombcurso) {
        this.nombcurso = nombcurso;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
}
