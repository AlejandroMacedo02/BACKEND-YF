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
@Table(name = "facultad")
public class Facultad {
    
    @Id
    @Column(name = "fa_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long faId;
    
    @Column(name = "fa_nombre")
    private String faNombre;
    
    @Column(name = "fa_color")
    private String faColor;
    
}
