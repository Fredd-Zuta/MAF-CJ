
package com.maf_cj.maf.cj.service;


import com.maf_cj.maf.cj.entity.Taller;
import com.mafcj.mafcj.service.base.BaseService;
import java.util.List;


public interface TallerService extends BaseService<Taller, Long> {
    List<Taller> talleresActuales() throws Exception;
}
