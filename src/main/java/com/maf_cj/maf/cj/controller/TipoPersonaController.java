
package com.maf_cj.maf.cj.controller;

import com.maf_cj.maf.cj.controller.base.BaseControllerImpl;
import com.maf_cj.maf.cj.entity.TipoPersona;
import com.maf_cj.maf.cj.service.TipoPersonaServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/tipo_personas")
public class TipoPersonaController extends BaseControllerImpl<TipoPersona, TipoPersonaServiceImpl> {

}
