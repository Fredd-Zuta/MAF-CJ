package com.maf_cj.maf.cj.controller;

import com.maf_cj.maf.cj.controller.base.BaseControllerImpl;
import com.maf_cj.maf.cj.entity.TipoMaterial;
import com.maf_cj.maf.cj.service.TipoMaterialServiceImpl;
import java.time.LocalDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/tipomateriales")
public class TipoMaterialController extends BaseControllerImpl<TipoMaterial, TipoMaterialServiceImpl> {
    
    @GetMapping("/actuales")
    public ResponseEntity<?> tipoMaterialActuales(){
        try {
            LocalDate now = LocalDate.now();
            return ResponseEntity.status(HttpStatus.OK).body(service.TipoMaterialActuales());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"Error, intentelo más tarde, codigo: " + e.getMessage() +" \"}");
        }
    }
    
}
