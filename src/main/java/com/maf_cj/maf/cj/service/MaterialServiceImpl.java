package com.maf_cj.maf.cj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.maf.cj.entity.Material;
import proyecto.maf.cj.repository.MaterialRepository;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public List<Material> findAll() {
            return (List<Material>) materialRepository.findAll();
        }


    @Override
    public Material findById(Long id) {
       return materialRepository.findById(id).orElse(null);
    }

    @Override
    public Material save(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public void delete(Material material) {
    materialRepository.delete(material);
    }

    @Override
    public void deleteById(long id) {
    materialRepository.deleteById(id);
    }
}
