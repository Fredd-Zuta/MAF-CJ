package com.maf_cj.maf.cj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maf_cj.maf.cj.entity.TipoMaterial;
import com.maf_cj.maf.cj.repository.TipoMaterialRepository;

import java.util.List;

@Service
public class TipoMaterialServiceImpl implements TipoMaterialService {
   @Autowired
   private TipoMaterialRepository tipoMaterialRepository;

    @Override
    public List<TipoMaterial> findAll() {
        return (List<TipoMaterial>) tipoMaterialRepository.findAll();

    }

    @Override
    public TipoMaterial findById(Long id) {
        return tipoMaterialRepository.findById(id).orElse(null);
    }

    @Override
    public TipoMaterial save(TipoMaterial tipoMaterial) {
        return tipoMaterialRepository.save(tipoMaterial);
    }

    @Override
    public void delete(TipoMaterial tipoMaterial) {
        tipoMaterialRepository.delete(tipoMaterial);

    }

    @Override
    public void deleteById(long id) {
        tipoMaterialRepository.deleteById(id);
    }
}
