package com.ads.healthcare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.healthcare.entities.Medicamento;
import com.ads.healthcare.repository.MedicamentoRepository;

@Service
public class MedicamentoService {
    @Autowired
    MedicamentoRepository repository;

    public List<Medicamento> listar() {
        List<Medicamento> medicamentos = repository.findAll();
        return medicamentos;

    }

    public String cadastro(Medicamento medicamento) {
        repository.save(medicamento);
        return "Cadastrado com suceso!!!";
    }
}