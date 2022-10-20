package com.maf_cj.maf.cj.service;

import com.maf_cj.maf.cj.entity.TipoMaterial;
import com.maf_cj.maf.cj.service.base.BaseService;

import java.util.List;

public interface TipoMaterialService extends BaseService<TipoMaterial, Long> {

    List<TipoMaterial> TipoMaterialActuales()throws Exception;
}
