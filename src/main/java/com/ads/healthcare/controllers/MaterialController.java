package com.ads.healthcare.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.healthcare.entities.Material;
import com.ads.healthcare.services.MaterialService;

@RestController
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    MaterialService service;

    @GetMapping("/lista")
    public ResponseEntity<List<Material>> listar() {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Material material) {
        return new ResponseEntity<>(service.cadastro(material), HttpStatus.OK);
    }
}
