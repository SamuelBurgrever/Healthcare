package com.ads.healthcare.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.healthcare.entities.Material;
import com.ads.healthcare.repository.MaterialRepository;

@Service
public class MaterialService {
    @Autowired
    MaterialRepository repository;

    public List<Material> listar() {
        List<Material> materiais = repository.findAll();
        return materiais.stream().map(x -> new Material()).collect(Collectors.toList());

    }

    public String cadastro(Material material) {
        repository.save(material);
        return "Cadastrado com suceso!!!";
    }
}