
package com.mafcj.mafcj.repository.Base;

import com.mafcj.mafcj.entity.base.Base;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author acer
 */

public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
