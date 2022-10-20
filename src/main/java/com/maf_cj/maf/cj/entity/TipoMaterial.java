package com.maf_cj.maf.cj.entity;

import com.maf_cj.maf.cj.entity.base.Base;
import lombok.*;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_material")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TipoMaterial extends Base{

    @Column(name = "tipodoc")
    private String tipoDoc;
}


