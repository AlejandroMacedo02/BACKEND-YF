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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author alejandromacedop
 */
@Entity
@Data
@Table(name = "escuela")
public class Escuela {
    
    @Id
    @Column(name = "ca_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long caId;
    
    @Column(name = "ca_nombre")
    private String caNombre;
    
    @Column(name = "ca_color")
    private String caColor;
    
    @ManyToOne
    @JoinColumn(name = "fa_id")
    private Facultad facultad;
    
}