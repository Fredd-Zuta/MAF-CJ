package com.maf_cj.maf.cj.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.maf_cj.maf.cj.entity.TipoMaterial;
import com.maf_cj.maf.cj.service.TipoMaterialService;

import java.util.List;

@RestController
@RequestMapping("/tipomateriales")
@Api(value = "TipoMateriales")
public class TipoMaterialController {
    @Autowired
    TipoMaterialService tipoMaterialService;
    @ApiOperation(value = "tipo de materiales")
    @GetMapping
    public List<TipoMaterial> findAll() {
        return tipoMaterialService.findAll();
}
    @ApiOperation(value = "tipos de materiales")
    @GetMapping(value = "/{id}")
    public ResponseEntity<TipoMaterial> findById(@PathVariable Long id) {
        TipoMaterial tipoMaterial = tipoMaterialService.findById(id);
        return ResponseEntity.ok(tipoMaterial);
    }
    @ApiOperation(value = "Agregar documento")
    @PostMapping
    public TipoMaterial save(@RequestBody TipoMaterial tipoMaterial) {
        return tipoMaterialService.save(tipoMaterial);
    }
    @ApiOperation(value = "Elimina un documento")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        tipoMaterialService.deleteById(id);
    }
}