package com.ads.healthcare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.healthcare.entities.Procedimento;
import com.ads.healthcare.repository.ProcedimentoRepository;

@Service
public class ProcedimentoService {
    @Autowired
    ProcedimentoRepository repository;

    public List<Procedimento> listar() {
        List<Procedimento> procedimentos = repository.findAll();
        return procedimentos;

    }

    public String cadastro(Procedimento procedimento) {
        repository.save(procedimento);
        return "Cadastrado com suceso!!!";
    }
}