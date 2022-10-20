
package com.maf_cj.maf.cj.repository;


import com.maf_cj.maf.cj.entity.Taller;
import com.maf_cj.maf.cj.repository.base.BaseRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TallerRepository extends BaseRepository<Taller, Long> {
    @Query("SELECT t FROM Taller t WHERE t.fecha >= CURDATE()")
    List<Taller> talleresActuales();
}
