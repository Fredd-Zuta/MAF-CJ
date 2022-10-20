
package com.maf_cj.maf.cj.service;

import com.maf_cj.maf.cj.entity.Asistencia;
import com.mafcj.mafcj.service.base.BaseService;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author acer
 */
public interface AsistenciaService extends BaseService<Asistencia, Long> {
    List<Asistencia> reporte(LocalDate fecha, Long id_taller) throws Exception;
    List<Asistencia> reporteGeneral(LocalDate fecha, Long id_taller, Long id_tipo_persona) throws Exception;
}
