
package com.maf_cj.maf.cj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.mafcj.mafcj.entity.base.Base;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author maf-cj
 */

@Entity
@Table(name = "facultades")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Facultad extends Base{
     @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "abreviatura")
    private String abreviatura;
}
