package com.maf_cj.maf.cj.entity;

import com.maf_cj.maf.cj.entity.base.Base;
import lombok.*;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "materiales")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Material extends Base{

  @Column(name = "nombre")
    private String Nombre;

  @Column(name = "decripcion")
  private String Descripcion;

  @ManyToOne
    @JoinColumn(name="id_tipo_material")
    private TipoMaterial tipo_material;
}
