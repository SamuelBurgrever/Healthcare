package com.ads.healthcare.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ads.healthcare.dto.PacienteDto;
import com.ads.healthcare.entities.Paciente;
import com.ads.healthcare.services.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    
    @Autowired
    PacienteService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrar(Paciente paciente){

        return new ResponseEntity<>(service.cadastro(paciente), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<PacienteDto>> listar() {

        return new ResponseEntity<>(service.listar(), HttpStatus.OK);
    
        
    }

     @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> excluir(@PathVariable("id") int id) {
        return service.excluir(id);
    }

    @GetMapping("/contatos/{id}")
    public ResponseEntity<Paciente> contatar(@PathVariable("id") int id){
        return service.listapacientes(id);
    }

    



}
