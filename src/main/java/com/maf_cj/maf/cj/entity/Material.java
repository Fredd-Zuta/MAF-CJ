package com.maf_cj.maf.cj.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "materiales")
public class Material {
  @Id
  @Column(name = "id_mat")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idMat;

  @Column(name = "nombre")
    private String Nombre;

  @Column(name = "decripcion")
  private String Descripcion;

}
