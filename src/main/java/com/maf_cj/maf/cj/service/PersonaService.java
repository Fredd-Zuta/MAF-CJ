
package com.maf_cj.maf.cj.service;

import com.maf_cj.maf.cj.entity.Persona;
import com.maf_cj.maf.cj.service.base.BaseService;
import java.util.List;

/**
 *
 * @author maf-cj
 */
public interface PersonaService extends BaseService<Persona, Long> {

    List<Persona> searchByDniOrCode(String filter) throws Exception;
}
