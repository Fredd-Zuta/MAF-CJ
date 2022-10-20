
package com.maf_cj.maf.cj.entity;


import javax.persistence.*;
import com.maf_cj.maf.cj.entity.base.Base;
import lombok.*;
import java.time.LocalDate;


@Entity
@Table(name = "asistencias")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Asistencia extends Base {
    @Column(name = "fecha")
    private LocalDate fecha;
    
    @Column(name = "tipoper")
    private String tipoper;
    
    @ManyToOne
    @JoinColumn(name="id_taller")
    private Taller taller;
    
    @ManyToOne
    @JoinColumn(name="id_persona")
    private Persona persona;
    
    
    
}
