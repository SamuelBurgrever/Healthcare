package com.ads.healthcare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ads.healthcare.entities.Prescricao;
import com.ads.healthcare.repository.PrescricaoRepository;

@Service
public class PrescricaoService {
    
    @Autowired 
    PrescricaoRepository repository;

    public String cadastro(Prescricao prescricao){

            repository.save(prescricao);

            return "Prescrição salva";
    }

    public List<Prescricao> listar(){
        
        List<Prescricao> lista = repository.findAll();

        return lista;
    }

}
