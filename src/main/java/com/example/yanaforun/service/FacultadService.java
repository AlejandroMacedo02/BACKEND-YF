/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.yanaforun.service;

import com.example.yanaforun.entity.Facultad;
import java.util.List;

/**
 *
 * @author alejandromacedop
 */
public interface FacultadService {
    public List<Facultad> findAll();

    public Facultad findById(Long id);
    
    public Facultad save (Facultad facultad);
    
    public void delete(Facultad facultad);
    
    public void deleteById(Long id);
    
}