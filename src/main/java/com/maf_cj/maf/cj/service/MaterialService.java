package com.maf_cj.maf.cj.service;

import proyecto.maf.cj.entity.Material;

import java.util.List;

public interface MaterialService {
    public List<Material>  findAll();
    public  Material findById(Long id);
    public  Material save(Material material);
    public void delete(Material material);
    public  void  deleteById(long id);
}
