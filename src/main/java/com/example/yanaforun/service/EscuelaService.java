/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.yanaforun.service;

import com.example.yanaforun.entity.Escuela;
import java.util.List;

/**
 *
 * @author alejandromacedop
 */
public interface EscuelaService {
    public List<Escuela> findAll();
    
    public Escuela findById(Long id);
    
    public Escuela save (Escuela escuela);
    
    public void delete(Escuela escuela);
    
    public void deleteById(Long id);
    
}