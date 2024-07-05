package com.ads.healthcare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.healthcare.entities.Faturamento;
import com.ads.healthcare.repository.FaturamentoRepository;

@Service
public class FaturamentoService {
    @Autowired
    FaturamentoRepository repository;


    public List<Faturamento> listar() {
        List<Faturamento> faturamentos = repository.findAll();
        return faturamentos;

    }


    public String cadastrar(Faturamento faturamento){
        repository.save(faturamento);
        return "Cadastro realizado";
    }



}