
package com.maf_cj.maf.cj.entity;

import com.maf_cj.maf.cj.entity.base.Base;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table(name = "tipo_personas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TipoPersona extends Base {
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
}
