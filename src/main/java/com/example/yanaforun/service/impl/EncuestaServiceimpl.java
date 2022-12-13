/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.yanaforun.service.impl;

import com.example.yanaforun.entity.Encuesta;
import com.example.yanaforun.repository.EncuestaRepository;
import com.example.yanaforun.service.EncuestaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandromacedop
 */
@Service
public class EncuestaServiceimpl implements EncuestaService {

    @Autowired
    EncuestaRepository encuestaRepository;
    
    @Override
    public List<Encuesta> findAll() {
                return (List<Encuesta>) encuestaRepository.findAll();
    }
    
    @Override
    public Encuesta findById(Long id) {
        return encuestaRepository.findById(id).orElse(null);
    }

    @Override
    public Encuesta save(Encuesta encuesta) {
        return encuestaRepository.save(encuesta);
    }

    @Override
    public void delete(Encuesta encuesta) {
        encuestaRepository.delete(encuesta);
    }

    @Override
    public void deleteById(Long id) {
        encuestaRepository.deleteById(id);
    }

    
}