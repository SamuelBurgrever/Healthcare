package com.ads.healthcare.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private Double valor;

    @JsonIgnore
    @OneToMany(mappedBy = "medicamento_prescricao")
    public List<Prescricao> prescriocoes;

    public Medicamento() {
    }

    

    public Medicamento(int id, String nome, Double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    

    

}