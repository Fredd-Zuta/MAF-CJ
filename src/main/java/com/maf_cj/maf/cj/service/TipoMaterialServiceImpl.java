package com.maf_cj.maf.cj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maf_cj.maf.cj.entity.TipoMaterial;
import com.maf_cj.maf.cj.repository.TipoMaterialRepository;
import com.maf_cj.maf.cj.repository.base.BaseRepository;
import com.maf_cj.maf.cj.service.base.BaseServiceImpl;

import java.util.List;

@Service
public class TipoMaterialServiceImpl extends BaseServiceImpl<TipoMaterial, Long> implements TipoMaterialService {
   
    @Autowired
   private TipoMaterialRepository tipoMaterialRepository;
   
   public TipoMaterialServiceImpl(BaseRepository<TipoMaterial, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<TipoMaterial> TipoMaterialActuales() throws Exception {
      try {
          List<TipoMaterial> list = tipoMaterialRepository.tipoMaterialActuales();
          return list;
      }catch (Exception e){
          throw new Exception(e.getMessage());
      }
    }
}
