
package com.maf_cj.maf.cj.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.maf_cj.maf.cj.entity.TipoPersona;

import java.util.List;


@Repository
public interface TipoPersonaRepository extends CrudRepository<TipoPersona, Long> {
    
        @Query("SELECT t FROM Taller t WHERE t.fecha >= CURDATE()")
    List<TipoPersona> tipoPersActuales();
}
