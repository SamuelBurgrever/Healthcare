package com.ads.healthcare.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.healthcare.dto.FaturamentoDto;
import com.ads.healthcare.entities.Faturamento;
import com.ads.healthcare.services.FaturamentoService;

@RestController
@RequestMapping("/faturamento")
public class FaturamentoController {

    @Autowired
    FaturamentoService service;


    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Faturamento faturamento) {
        return new ResponseEntity<>(service.cadastrar(faturamento), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<FaturamentoDto>> listar(){
        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    }

}