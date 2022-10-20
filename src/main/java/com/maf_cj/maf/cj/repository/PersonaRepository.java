
package com.maf_cj.maf.cj.repository;

import com.maf_cj.maf.cj.entity.Persona;
import com.maf_cj.maf.cj.repository.base.BaseRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author maf-cj
 */
@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    @Query(value = "SELECT p FROM Persona p WHERE p.dni LIKE %:filter%")
    List<Persona> searchByDniOrCode(@Param("filter") String filter);
}
