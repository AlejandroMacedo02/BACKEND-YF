/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.yanaforun.service.impl;

import com.example.yanaforun.entity.RespuestaEncuesta;
import com.example.yanaforun.repository.RespuestaEncuestaRepository;
import com.example.yanaforun.service.RespuestaEncuestaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandromacedop
 */
@Service
public class RespuestaEncuestaServiceimpl implements RespuestaEncuestaService{
     @Autowired
    RespuestaEncuestaRepository respuestaEncuestaRepository;
    
    @Override
    public List<RespuestaEncuesta> findAll() {
        return (List<RespuestaEncuesta>) respuestaEncuestaRepository.findAll();
    }

    @Override
    public RespuestaEncuesta findById(Long id) {
        return respuestaEncuestaRepository.findById(id).orElse(null);
    }

    @Override
    public RespuestaEncuesta save(RespuestaEncuesta respuestaEncuesta) {
        return respuestaEncuestaRepository.save(respuestaEncuesta);
    }

    @Override
    public void delete(RespuestaEncuesta respuestaEncuesta) {
        respuestaEncuestaRepository.delete(respuestaEncuesta);
    }

    @Override
    public void deleteById(Long id) {
        respuestaEncuestaRepository.deleteById(id);
    }
    
    
}
