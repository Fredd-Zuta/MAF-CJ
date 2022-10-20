
package com.mafcj.mafcj.controller.base;

import com.mafcj.mafcj.entity.base.Base;
import java.io.Serializable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author acer
 */
public interface BaseController <E extends Base, ID extends Serializable> {
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable Long id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@PathVariable ID id,@RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
