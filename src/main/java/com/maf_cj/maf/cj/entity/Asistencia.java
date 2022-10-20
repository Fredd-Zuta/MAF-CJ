
package com.maf_cj.maf.cj.entity;


import javax.persistence.*;
import com.mafcj.mafcj.entity.base.Base;
import lombok.*;
import java.time.LocalDate;
/**
 *
 * @author acer
 */
@Entity
@Table(name = "asistencias")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Asistencia extends Base {
    @Column(name = "fecha")
    private LocalDate fecha;
    
    @ManyToOne
    @JoinColumn(name="id_taller")
    private Taller taller;
    
    @ManyToOne
    @JoinColumn(name="id_persona")
    private Persona persona;
    
}
