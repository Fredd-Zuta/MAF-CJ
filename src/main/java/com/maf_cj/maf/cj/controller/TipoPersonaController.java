
package com.maf_cj.maf.cj.controller;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity 
@Table(name = "tipo_personas")
public class TipoPersonaController {
        @Id
    @Column(name = "tipe_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tipeId;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
}