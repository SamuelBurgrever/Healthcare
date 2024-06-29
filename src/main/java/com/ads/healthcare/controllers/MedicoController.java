package com.ads.healthcare.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.healthcare.dto.MedicoDto;
import com.ads.healthcare.entities.Medico;
import com.ads.healthcare.services.MedicoService;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    MedicoService service;

    @GetMapping("/lista")
    public ResponseEntity<List<MedicoDto>> listar() {
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Medico medico) {
        return new ResponseEntity<>(service.cadastro(medico), HttpStatus.OK);
    }
}