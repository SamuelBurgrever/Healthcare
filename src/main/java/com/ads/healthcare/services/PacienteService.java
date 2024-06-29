package com.ads.healthcare.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
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
    


}
