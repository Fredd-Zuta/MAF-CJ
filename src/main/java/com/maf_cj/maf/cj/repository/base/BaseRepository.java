
package com.maf_cj.maf.cj.repository.base;

import com.maf_cj.maf.cj.entity.base.Base;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
