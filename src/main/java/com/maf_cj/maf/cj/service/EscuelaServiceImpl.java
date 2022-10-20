
package com.maf_cj.maf.cj.service;

import com.maf_cj.maf.cj.entity.Escuela;
import com.maf_cj.maf.cj.repository.base.BaseRepository;
import com.maf_cj.maf.cj.repository.EscuelaRepository;
import com.maf_cj.maf.cj.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class EscuelaServiceImpl extends BaseServiceImpl<Escuela, Long>  implements EscuelaService {
    @Autowired
    protected EscuelaRepository escuelaRepository;

    public EscuelaServiceImpl(BaseRepository<Escuela, Long> baseRepository) {
        super(baseRepository);
    }
}
