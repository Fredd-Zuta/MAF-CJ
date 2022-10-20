
package com.maf_cj.maf.cj.controller;

import com.maf_cj.maf.cj.controller.base.BaseControllerImpl;
import com.maf_cj.maf.cj.entity.Escuela;
import com.maf_cj.maf.cj.service.EscuelaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/escuelas")
public class EscuelaController extends BaseControllerImpl<Escuela, EscuelaServiceImpl> {
    
}
