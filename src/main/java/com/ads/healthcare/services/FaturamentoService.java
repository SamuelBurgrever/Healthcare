package com.ads.healthcare.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.healthcare.dto.FaturamentoDto;
import com.ads.healthcare.entities.Faturamento;
import com.ads.healthcare.repository.FaturamentoRepository;

@Service
public class FaturamentoService {
    @Autowired
    FaturamentoRepository repository;


    public List<FaturamentoDto> listar() {
        List<Faturamento> lista = repository.findAll();
        return lista.stream().map(x -> new FaturamentoDto(x)).collect(Collectors.toList());

    }


    public String cadastrar(Faturamento faturamento){
        repository.save(faturamento);
        return "Cadastro realizado";
    }



}