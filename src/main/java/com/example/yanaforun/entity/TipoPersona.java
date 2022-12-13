/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.yanaforun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author alejandromacedop
 */
@Entity
@Data
@Table(name = "tipo_persona")
public class TipoPersona {
    
    @Id
    @Column(name = "tp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tpId;
    
    @Column(name = "tp_nombre")
    private String tpNombre;
    
    @Column(name = "tp_des")
    private String tpDesc;
    
}
