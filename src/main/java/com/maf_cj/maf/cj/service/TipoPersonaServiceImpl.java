
package com.maf_cj.maf.cj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maf_cj.maf.cj.entity.TipoPersona;
import com.maf_cj.maf.cj.repository.TipoPersonaRepository;

import java.util.List;

@Service
public class TipoPersonaServiceImpl implements TipoPersonaService {
    
    @Autowired
    private TipoPersonaRepository tipopersonaRepository;
    
    
    @Override
    public List<TipoPersona> findAll() {
        return (List<TipoPersona>) tipopersonaRepository.findAll();
    }

    @Override
    public TipoPersona findById(Long id) {
        return tipopersonaRepository.findById(id).orElse(null);
    }

    @Override
    public TipoPersona save(TipoPersona tipopersona) {
        return tipopersonaRepository.save(tipopersona);
    }

    @Override
    public void delete(TipoPersona tipopersona) {
        tipopersonaRepository.delete(tipopersona);
    }

    @Override
    public void deleteById(Long id) {
        tipopersonaRepository.deleteById(id);
    }
    
}

