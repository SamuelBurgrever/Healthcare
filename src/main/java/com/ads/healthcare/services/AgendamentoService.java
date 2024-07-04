package com.ads.healthcare.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.healthcare.dto.AgendamentoDto;
import com.ads.healthcare.entities.Agendamento;
import com.ads.healthcare.repository.AgendamentoRepository;

@Service
public class AgendamentoService {

    @Autowired
    AgendamentoRepository repository;

    public String cadastro(Agendamento agendamento){

        repository.save(agendamento);


        return "Agendamento feito";
    }

    public List<AgendamentoDto> listar(){

        List<Agendamento> lista = repository.findAll();
        return lista.stream().map(x -> new AgendamentoDto(x)).collect(Collectors.toList());

    }
    
}
