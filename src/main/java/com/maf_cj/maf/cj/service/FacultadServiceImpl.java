
package com.maf_cj.maf.cj.service;

import com.maf_cj.maf.cj.entity.Facultad;
import com.maf_cj.maf.cj.repository.FacultadRepository;
import com.maf_cj.maf.cj.repository.base.BaseRepository;
import com.maf_cj.maf.cj.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maf-cj
 */
@Service
public class FacultadServiceImpl extends BaseServiceImpl<Facultad, Long>  implements FacultadService {
    @Autowired
    protected FacultadRepository facultadRepository;

    public FacultadServiceImpl(BaseRepository<Facultad, Long> baseRepository) {
        super(baseRepository);
    }
}