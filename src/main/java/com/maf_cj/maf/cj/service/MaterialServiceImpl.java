package com.maf_cj.maf.cj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maf_cj.maf.cj.entity.Material;
import com.maf_cj.maf.cj.repository.MaterialRepository;
import com.maf_cj.maf.cj.repository.base.BaseRepository;
import com.maf_cj.maf.cj.service.base.BaseServiceImpl;

import java.util.List;

@Service
public class MaterialServiceImpl extends BaseServiceImpl<Material, Long> implements MaterialService {
    @Autowired
    private MaterialRepository materialRepository;
    
    public MaterialServiceImpl(BaseRepository<Material, Long> baseRepository) {
        super(baseRepository);
    }
    
    @Override
    public List<Material> materialesActuales() throws Exception {
      try {
          List<Material> list = materialRepository.materialesActuales();
          return list;
      }catch (Exception e){
          throw new Exception(e.getMessage());
      }
    }
}
