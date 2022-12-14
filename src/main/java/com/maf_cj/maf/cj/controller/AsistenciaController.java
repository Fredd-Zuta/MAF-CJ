
package com.maf_cj.maf.cj.controller;

import com.maf_cj.maf.cj.controller.base.BaseControllerImpl;
import com.maf_cj.maf.cj.entity.Asistencia;
import com.maf_cj.maf.cj.service.AsistenciaServiceImpl;
import java.time.LocalDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author maf-cf
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/asistencias")
public class AsistenciaController extends BaseControllerImpl<Asistencia, AsistenciaServiceImpl> {
    
    @GetMapping("reporte")
    public ResponseEntity<?> reporte(@RequestParam String fecha, @RequestParam String id_taller){
       try {
           LocalDate localDate = LocalDate.parse(fecha);
           Long id = Long.parseLong(id_taller);
           return ResponseEntity.status(HttpStatus.OK).body(service.reporte(localDate, id));
       }catch (Exception e){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"Error, intentelo más tarde, codigo: " + e.getMessage() +" \"}");
       }
    }

    @GetMapping("reporte_general")
    public ResponseEntity<?> reporteGeneral(@RequestParam String fecha, @RequestParam String id_taller, @RequestParam String id_tipo_persona){
        try {
            LocalDate localDate = LocalDate.parse(fecha);
            Long id = Long.parseLong(id_taller);
            Long id2 = Long.valueOf(1);
            return ResponseEntity.status(HttpStatus.OK).body(service.reporteGeneral(localDate, id, id2));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"Error, intentelo más tarde, codigo: " + e.getMessage() +" \"}");
        }
    }
}
