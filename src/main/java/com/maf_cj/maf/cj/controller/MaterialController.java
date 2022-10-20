package com.maf_cj.maf.cj.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto.maf.cj.entity.Material;
import proyecto.maf.cj.service.MaterialService;

import java.util.List;

@RestController
@RequestMapping("/material")
@ApiOperation(value = "materiales")
public class MaterialController {
    @Autowired
    MaterialService materialesService;
    @ApiOperation(value = "lista de materiales")
    @GetMapping
    public List<Material> findAll(){
        return materialesService.findAll();
    }

    @ApiOperation(value = "lista Materiales")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Material> findById(@PathVariable Long id){
    Material material= materialesService.findById(id);
    return ResponseEntity.ok(material);
    }
    @ApiOperation(value = "Agrega materiales")
    @PostMapping
    public Material save(@RequestBody Material material) {
        return materialesService.save(material);
    }
    @ApiOperation(value = "Elimina un  material")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        materialesService.deleteById(id);
    }
}
