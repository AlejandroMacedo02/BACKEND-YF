/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.yanaforun.service;

import com.example.yanaforun.entity.RespuestaEncuesta;
import java.util.List;

/**
 *
 * @author alejandromacedop
 */
public interface RespuestaEncuestaService {
    public List<RespuestaEncuesta> findAll();
    
    public RespuestaEncuesta findById(Long id);
    
    public RespuestaEncuesta save (RespuestaEncuesta respuestaEncuesta);
    
    public void delete(RespuestaEncuesta respuestaEncuesta);
    
    public void deleteById(Long id);
}
