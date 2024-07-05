package com.ads.healthcare.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ads.healthcare.dto.ProntuarioDto;

import com.ads.healthcare.entities.Prontuario;
import com.ads.healthcare.services.ProntuarioService;

@RestController
@RequestMapping("/prontuario")
public class ProntuarioController {

    @Autowired
    ProntuarioService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Prontuario prontuario){

        return new ResponseEntity<>(service.cadastro(prontuario), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<ProntuarioDto>> listar() {

        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    
        
    }
    
}
