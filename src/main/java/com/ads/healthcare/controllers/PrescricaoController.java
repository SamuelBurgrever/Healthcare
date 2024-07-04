package com.ads.healthcare.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ads.healthcare.entities.Prescricao;
import com.ads.healthcare.services.PrescricaoService;

@RestController
@RequestMapping("/prescricao")
public class PrescricaoController {
    
    @Autowired
    PrescricaoService service;

 @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Prescricao prescricao){

        return new ResponseEntity<>(service.cadastro(prescricao), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Prescricao>> listar() {

        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    
        
    }

}
