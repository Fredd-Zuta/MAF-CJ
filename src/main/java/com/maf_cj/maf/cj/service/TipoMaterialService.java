package com.maf_cj.maf.cj.service;

import com.maf_cj.maf.cj.entity.TipoMaterial;

import java.util.List;

public interface TipoMaterialService {
    public List<TipoMaterial> findAll();
    public  TipoMaterial findById(Long id);
    public  TipoMaterial save(TipoMaterial tipoMaterial);
    public void delete(TipoMaterial tipoMaterial);
    public  void  deleteById(long id);
}
