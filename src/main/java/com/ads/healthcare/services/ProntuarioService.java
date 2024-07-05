package com.ads.healthcare.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.healthcare.dto.AgendamentoDto;
import com.ads.healthcare.dto.ProntuarioDto;
import com.ads.healthcare.entities.Agendamento;
import com.ads.healthcare.entities.Prontuario;
import com.ads.healthcare.repository.ProntuarioRepository;

@Service
public class ProntuarioService {

    @Autowired
    ProntuarioRepository repository;

    public String cadastro(Prontuario prontuario){

        repository.save(prontuario);


        return "Cadastrado";
    }

    public List<ProntuarioDto> listar(){

        List<Prontuario> lista = repository.findAll();
        return lista.stream().map(x -> new ProntuarioDto(x)).collect(Collectors.toList());

    }
    
}
