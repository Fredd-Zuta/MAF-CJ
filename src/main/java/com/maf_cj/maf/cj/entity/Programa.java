
package com.maf_cj.maf.cj.entity;

import com.maf_cj.maf.cj.entity.base.Base;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.*;


@Entity
@Table(name="programas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Programa extends Base {
    @Column(name="nombre")
    private String nombre;

    @Column(name="descripcion")
    private String descripcion;    
}
