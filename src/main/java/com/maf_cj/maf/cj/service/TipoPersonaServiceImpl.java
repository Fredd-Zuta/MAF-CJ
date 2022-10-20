
package com.maf_cj.maf.cj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maf_cj.maf.cj.entity.TipoPersona;
import com.maf_cj.maf.cj.repository.TipoPersonaRepository;
import com.maf_cj.maf.cj.repository.base.BaseRepository;
import com.maf_cj.maf.cj.service.base.BaseServiceImpl;


@Service
public class TipoPersonaServiceImpl extends BaseServiceImpl<TipoPersona, Long> implements TipoPersonaService {
    @Autowired
    private TipoPersonaRepository tipopersonaRepository;

    public TipoPersonaServiceImpl(BaseRepository<TipoPersona, Long> baseRepository) {
        super(baseRepository);
    }
}