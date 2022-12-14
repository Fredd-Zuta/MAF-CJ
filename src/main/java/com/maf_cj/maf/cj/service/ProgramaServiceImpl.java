
package com.maf_cj.maf.cj.service;


import com.maf_cj.maf.cj.entity.Programa;
import com.maf_cj.maf.cj.repository.ProgramaRepository;
import com.maf_cj.maf.cj.repository.base.BaseRepository;
import com.maf_cj.maf.cj.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaServiceImpl extends BaseServiceImpl<Programa, Long> implements ProgramaService {
    @Autowired
    private ProgramaRepository programaRepository;

    public ProgramaServiceImpl(BaseRepository<Programa, Long> baseRepository) {
        super(baseRepository);
    }
}
