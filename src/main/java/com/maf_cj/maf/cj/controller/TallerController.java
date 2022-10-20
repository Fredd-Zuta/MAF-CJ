
package com.maf_cj.maf.cj.controller;

import com.maf_cj.maf.cj.entity.Taller;
import com.maf_cj.maf.cj.service.TallerServiceImpl;
import com.mafcj.mafcj.controller.base.BaseControllerImpl;
import java.time.LocalDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/talleres")
public class TallerController extends BaseControllerImpl<Taller, TallerServiceImpl> {
    
    @GetMapping("/actuales")
    public ResponseEntity<?> talleresActuales(){
        try {
            LocalDate now = LocalDate.now();
            return ResponseEntity.status(HttpStatus.OK).body(service.talleresActuales());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"Error, intentelo más tarde, codigo: " + e.getMessage() +" \"}");
        }
    }
}
