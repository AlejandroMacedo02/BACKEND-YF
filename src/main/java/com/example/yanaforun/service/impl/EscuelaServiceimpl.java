/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.yanaforun.service.impl;

import com.example.yanaforun.entity.Escuela;
import com.example.yanaforun.repository.EscuelaRepository;
import com.example.yanaforun.service.EscuelaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandromacedop
 */
@Service
public class EscuelaServiceimpl implements EscuelaService {

    @Autowired
    EscuelaRepository escuelaRepository;
    
    @Override
    public List<Escuela> findAll() {
                return (List<Escuela>) escuelaRepository.findAll();
    }
    
    @Override
    public Escuela findById(Long id) {
        return escuelaRepository.findById(id).orElse(null);
    }

    @Override
    public Escuela save(Escuela escuela) {
        return escuelaRepository.save(escuela);
    }

    @Override
    public void delete(Escuela escuela) {
        escuelaRepository.delete(escuela);
    }

    @Override
    public void deleteById(Long id) {
        escuelaRepository.deleteById(id);
    }

    
}
