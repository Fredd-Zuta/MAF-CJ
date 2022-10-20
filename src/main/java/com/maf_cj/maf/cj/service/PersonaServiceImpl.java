
package com.maf_cj.maf.cj.service;

import com.maf_cj.maf.cj.entity.Persona;
import com.maf_cj.maf.cj.repository.PersonaRepository;
import com.mafcj.mafcj.repository.Base.BaseRepository;
import com.mafcj.mafcj.service.base.BaseServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maf-cj
 */

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Persona> searchByDniOrCode(String filter) throws Exception {
        try {
            List<Persona> list = personaRepository.searchByDniOrCode(filter);
            return list;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
