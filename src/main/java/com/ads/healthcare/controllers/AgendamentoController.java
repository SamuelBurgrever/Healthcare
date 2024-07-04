package com.ads.healthcare.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.healthcare.dto.AgendamentoDto;
import com.ads.healthcare.entities.Agendamento;
import com.ads.healthcare.services.AgendamentoService;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
    
    @Autowired
    AgendamentoService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Agendamento agendamento){

        return new ResponseEntity<>(service.cadastro(agendamento), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<AgendamentoDto>> listar() {

        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    
        
    }
}
