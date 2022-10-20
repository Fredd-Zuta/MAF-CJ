
package com.maf_cj.maf.cj.service.base;

import com.maf_cj.maf.cj.entity.base.Base;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author acer
 */
public interface BaseService <E extends Base, ID extends Serializable> {
    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}
