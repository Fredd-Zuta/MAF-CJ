package com.maf_cj.maf.cj.controller;

import com.maf_cj.maf.cj.controller.base.BaseControllerImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.maf_cj.maf.cj.entity.Material;
import com.maf_cj.maf.cj.service.MaterialServiceImpl;
import java.time.LocalDate;

import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/materiales")
public class MaterialController extends BaseControllerImpl<Material, MaterialServiceImpl>{
    
    @GetMapping("/actuales")
    public ResponseEntity<?> materialesActuales(){
        try {
            LocalDate now = LocalDate.now();
            return ResponseEntity.status(HttpStatus.OK).body(service.materialesActuales());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"Error, intentelo más tarde, codigo: " + e.getMessage() +" \"}");
        }
    }
}
