package com.example.demo.DemoController;


import com.example.demo.DemoEntity.estudianteEntity;
import com.example.demo.DemoServices.estudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolutionException;
import java.util.List;

@RestController
@RequestMapping("/estudiante")
@CrossOrigin(origins = "http://localhost:4200/" )
public class estudianteController<EstudianteEntity> {

    @Autowired
    private estudianteRepository estRepo;
    private estudianteEntity estEn;

    @GetMapping
    public List<estudianteEntity>obtenerEstudiante(){
        return (List<estudianteEntity>)estRepo.findAll();
    }

    @PostMapping
    public void agregarEstudiante(@RequestBody estudianteEntity estEn){
        estRepo.save(estEn);
    }

    @PutMapping
    public void actualizarEstudiante(@RequestBody estudianteEntity estEn){
        estRepo.save(estEn);
    }

    @DeleteMapping
    public void eliminarEstudiante(@RequestBody estudianteEntity estEn){
        estRepo.deleteById(estEn.getIdestudiante());
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<EstudianteEntity> obtenerEstudiantePorID (@PathVariable ("id") Integer idEnity){
        EstudianteEntity estuEntity = (EstudianteEntity) estRepo.findById(idEnity).
                orElseThrow( () -> new ResolutionException("No existe el estudiante"));
        return ResponseEntity.ok( estuEntity );
    }

    @PutMapping("/{id}")
    public void modificarEstudianteUnico ( @PathVariable ("id") Integer id, @RequestBody EstudianteEntity estuEn){
        estEn.setIdestudiante(id);
        estRepo.save(estEn);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstudiante (@PathVariable ("id") Integer id){
        estRepo.deleteById(id);
    }


}
