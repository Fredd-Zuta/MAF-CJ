
package com.maf_cj.maf.cj.service;


import com.maf_cj.maf.cj.entity.Taller;
import com.maf_cj.maf.cj.repository.TallerRepository;
import com.maf_cj.maf.cj.repository.base.BaseRepository;
import com.maf_cj.maf.cj.service.base.BaseServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TallerServiceImpl extends BaseServiceImpl<Taller, Long> implements TallerService {
    @Autowired
    private TallerRepository tallerRepository;

    public TallerServiceImpl(BaseRepository<Taller, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Taller> talleresActuales() throws Exception {
      try {
          List<Taller> list = tallerRepository.talleresActuales();
          return list;
      }catch (Exception e){
          throw new Exception(e.getMessage());
      }
    }
}
