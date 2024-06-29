package com.ads.healthcare.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.healthcare.dto.MedicoDto;
import com.ads.healthcare.entities.Medico;
import com.ads.healthcare.repository.MedicoRepository;

@Service
public class MedicoService {
    @Autowired
    MedicoRepository repository;

    public List<MedicoDto> listar() {
        List<Medico> medicos = repository.findAll();
        return medicos.stream().map(x -> new MedicoDto(x)).collect(Collectors.toList());

    }

    public String cadastro(Medico medico) {
        repository.save(medico);
        return "Cadastrado com suceso!!!";
    }
}
