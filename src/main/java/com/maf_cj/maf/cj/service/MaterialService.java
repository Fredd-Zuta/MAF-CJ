package com.maf_cj.maf.cj.service;

import com.maf_cj.maf.cj.entity.Material;
import com.maf_cj.maf.cj.service.base.BaseService;

import java.util.List;

public interface MaterialService extends BaseService<Material, Long>{
    
    List<Material> materialesActuales() throws Exception;
}
