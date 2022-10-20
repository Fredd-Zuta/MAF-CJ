
package com.maf_cj.maf.cj.service;

import com.maf_cj.maf.cj.entity.Asistencia;
import com.maf_cj.maf.cj.repository.AsistenciaRepository;
import com.maf_cj.maf.cj.repository.base.BaseRepository;
import com.maf_cj.maf.cj.service.base.BaseServiceImpl;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class AsistenciaServiceImpl extends BaseServiceImpl<Asistencia, Long> implements AsistenciaService {
    // extends BaseServiceImpl<E, Long> implements EService
    @Autowired
    private AsistenciaRepository asistenciaRepository;

    public AsistenciaServiceImpl(BaseRepository<Asistencia, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Asistencia> reporte(LocalDate fecha, Long id_taller) throws Exception {
        try {
            List<Asistencia> list = asistenciaRepository.reporte(fecha, id_taller);
            return list;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Asistencia> reporteGeneral(LocalDate fecha, Long id_taller, Long id_tipo_persona) throws Exception {
        try {
            List<Asistencia> list = asistenciaRepository.reporteGeneral(fecha, id_taller, id_tipo_persona);
            return list;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
