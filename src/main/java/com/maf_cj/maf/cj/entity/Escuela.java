
package com.maf_cj.maf.cj.entity;

import com.maf_cj.maf.cj.entity.base.Base;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "escuelas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Escuela extends Base {
    @Column(name = "nombre")
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "id_facultad")
    private Facultad facultad;
}
