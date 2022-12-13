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
@Table(name = "materiales")
public class Materiales {
    
    @Id
    @Column(name = "ma_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maId;
    
    @Column(name = "ma_name")
    private String maName;
    
    @ManyToOne
    @JoinColumn(name = "ta_id")
    private Taller taller;
    
    @ManyToOne
    @JoinColumn(name = "ca_id")
    private TipoMateriales tipoMateriales;
    
}