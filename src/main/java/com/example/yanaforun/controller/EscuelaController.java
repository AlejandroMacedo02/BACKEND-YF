/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.yanaforun.controller;

import com.example.yanaforun.entity.Escuela;
import com.example.yanaforun.service.EscuelaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alejandromacedop
 */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/carreras")
@Api(value = "Microservicio de Gestion de las escuelas", description = "Microservicio de Gestion de las escuelas")
public class EscuelaController {
    
    @Autowired
    EscuelaService escuelaService;
    
    @ApiOperation(value = "Lista de carreras")
    @GetMapping
    public ResponseEntity<?> findAll() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Lista de carreras");
        result.put("data", escuelaService.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value = "Obtiene datos de carrera")
    @GetMapping("/{id}")
    public ResponseEntity<Escuela> findById(@PathVariable Long id) {
        Escuela carrera = escuelaService.findById(id);
        return ResponseEntity.ok(carrera);
    }

    
    @ApiOperation(value = "Crea una carrera")
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Escuela escuela) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Carrera registrado correctamente");
        result.put("data", escuelaService.save(escuela));
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    
    @ApiOperation(value = "Modifica una carrera")
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(value = "id") Long id, @RequestBody Escuela escuela) {
        HashMap<String, Object> result = new HashMap<>();
        Escuela data = escuelaService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con Id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            escuela.setCaId(id);
            escuelaService.save(escuela);
            result.put("success", true);
            result.put("message", "Datos actualizados correctamente.");
            result.put("data", escuela);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @ApiOperation(value = "Elimina una carrera")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        HashMap<String, Object> result = new HashMap<>();
    Escuela data = escuelaService.findById(id);
    if(data == null){
        result.put("success", false);
        result.put("message", "No existe carrera con id:" + id);
  return new ResponseEntity <>(result, HttpStatus.NOT_FOUND);
    } else{
  escuelaService.deleteById(id);
            result.put("success", true);
            result.put("message", "Registro Eliminado correctamente");
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
    }
    
}