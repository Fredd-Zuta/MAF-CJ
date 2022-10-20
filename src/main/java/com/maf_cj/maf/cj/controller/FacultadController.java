
package com.maf_cj.maf.cj.controller;

import com.maf_cj.maf.cj.entity.Facultad;
import com.maf_cj.maf.cj.service.FacultadServiceImpl;
import com.maf_cj.maf.cj.controller.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author maf-cj
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/facultades")
public class FacultadController extends BaseControllerImpl<Facultad, FacultadServiceImpl> {

}
