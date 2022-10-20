package com.maf_cj.maf.cj.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tipo_material")
public class TipoMaterial {
    @Id
    @Column(name = "id_tima")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idTima;

    @Column(name = "tipodoc")
    private String tipoDoc;
}
