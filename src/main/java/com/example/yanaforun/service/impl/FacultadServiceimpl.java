/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.yanaforun.service.impl;

import com.example.yanaforun.entity.Facultad;
import com.example.yanaforun.repository.FacultadRepository;
import com.example.yanaforun.service.FacultadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandromacedop
 */
@Service
public class FacultadServiceimpl implements FacultadService{

    @Autowired
    FacultadRepository facultadRepository;
    
    @Override
    public List<Facultad> findAll() {
        return (List<Facultad>) facultadRepository.findAll();
    }

    @Override
    public Facultad findById(Long id) {
        return facultadRepository.findById(id).orElse(null);
    }

    @Override
    public Facultad save(Facultad facultad) {
        return facultadRepository.save(facultad);
    }

    @Override
    public void delete(Facultad facultad) {
        facultadRepository.delete(facultad);
    }

    @Override
    public void deleteById(Long id) {
        facultadRepository.deleteById(id);
    }
    
}
