
package com.maf_cj.maf.cj.controller;

import com.maf_cj.maf.cj.entity.Programa;
import com.maf_cj.maf.cj.service.ProgramaServiceImpl;
import com.mafcj.mafcj.controller.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/programas")
public class ProgramaController extends BaseControllerImpl<Programa, ProgramaServiceImpl> {
    
}
