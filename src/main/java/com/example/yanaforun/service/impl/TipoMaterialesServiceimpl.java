/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.yanaforun.service.impl;

import com.example.yanaforun.entity.TipoMateriales;
import com.example.yanaforun.repository.TipoMaterialesRepository;
import com.example.yanaforun.service.TipoMaterialesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alejandromacedop
 */
@Service
public class TipoMaterialesServiceimpl implements TipoMaterialesService{

    @Autowired
    TipoMaterialesRepository tipoMaterialesRepository;
    
    @Override
    public List<TipoMateriales> findAll() {
        return (List<TipoMateriales>) tipoMaterialesRepository.findAll();
    }

    @Override
    public TipoMateriales findById(Long id) {
        return tipoMaterialesRepository.findById(id).orElse(null);
    }

    @Override
    public TipoMateriales save(TipoMateriales tipoMateriales) {
        return tipoMaterialesRepository.save(tipoMateriales);
    }

    @Override
    public void delete(TipoMateriales tipoMateriales) {
        tipoMaterialesRepository.delete(tipoMateriales);
    }

    @Override
    public void deleteById(Long id) {
        tipoMaterialesRepository.deleteById(id);
    }
    
}
