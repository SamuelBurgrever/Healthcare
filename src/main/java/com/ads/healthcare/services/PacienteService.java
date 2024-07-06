package com.ads.healthcare.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ads.healthcare.dto.PacienteDto;
import com.ads.healthcare.entities.Paciente;
import com.ads.healthcare.repository.PacienteRepository;
//teste
@Service
public class PacienteService {
    
    @Autowired
    PacienteRepository repository;

    public String cadastro(Paciente paciente){

        repository.save(paciente);


        return "Paciente cadastrado";
    }

    public List<PacienteDto> listar(){

        List<Paciente> lista = repository.findAll();
        return lista.stream().map(x -> new PacienteDto(x)).collect(Collectors.toList());

    }

    public ResponseEntity<String> excluir(int id) {
            Paciente paciente = repository.findById(id).orElse(null);

        if (paciente != null) {
            repository.delete(paciente);
            return new ResponseEntity<>("Tabela excluída", HttpStatus.OK);
        }

        return new ResponseEntity<>("Registro não encontrado", HttpStatus.NOT_FOUND);

    }

    public ResponseEntity<Paciente> listapacientes(int id){
        Paciente pacientes = repository.findById(id).orElse(null);

        if (pacientes != null){
            return new ResponseEntity<>(pacientes, HttpStatus.OK);
        }

            return new ResponseEntity<>(pacientes, HttpStatus.NOT_FOUND);

    }



}
