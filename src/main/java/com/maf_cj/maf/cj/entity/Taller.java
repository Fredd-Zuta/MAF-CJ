
package com.maf_cj.maf.cj.entity;

import com.maf_cj.maf.cj.entity.base.Base;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.*;

@Entity
@Table(name="talleres")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Taller extends Base {

    @Column(name="tema")
    private String tema;
    
    @Column(name="descrip")
    private String descrip;
    
    @Column(name="fecha")
    private LocalDate fecha;
    
    @Column(name="hora")
    private LocalTime hora;
            
    @Column(name="lugar")
    private String lugar;
    
    @Column(name="direccion")
    private String direccion;
    
    @ManyToOne
    @JoinColumn(name="id_programa")
    private Programa programa;
    
    @ManyToOne
    @JoinColumn(name="id_taller")
    private Taller taller;
    
}