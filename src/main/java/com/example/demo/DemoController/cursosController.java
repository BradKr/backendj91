package com.example.demo.DemoController;


import com.example.demo.DemoEntity.cursosEntity;
import com.example.demo.DemoServices.cursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class cursosController {

    @Autowired
    private cursosRepository curRepo;
    private cursosEntity curEn;

    //select
    @GetMapping
    public List<cursosEntity>obtenerCursos(){
        return (List<cursosEntity>) curRepo.findAll();
    }
    //insert
    @PostMapping
    public void agregarCurso(@RequestBody cursosEntity curEn){
       curRepo.save(curEn);
    }
    //update
    @PutMapping
    public void actualizarCurso(@RequestBody cursosEntity curEn){
        curRepo.save(curEn);
    }
    //delete
    @DeleteMapping
    public void eliminarCurso(@RequestBody cursosEntity curEn){
    curRepo.deleteById(curEn.getIdcurso());
    }

}
