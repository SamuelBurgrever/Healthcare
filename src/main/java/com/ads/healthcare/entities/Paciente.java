package com.ads.healthcare.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
//teste
@Entity
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cpf;
    private String genero;


    @JsonIgnore
    @OneToMany(mappedBy = "paciente_agendamento")
    public List<Agendamento> agendamentos;

    @JsonIgnore
    @OneToMany(mappedBy = "paciente_prescricao")
    public List<Prescricao> prescricaos;

    @JsonIgnore
    @OneToMany(mappedBy = "paciente_prontuario")
    public List<Prontuario> prontuarios_paciente;

    

    public Paciente() {
    }

    

    public Paciente(int id, String nome, String cpf, String genero, List<Agendamento> agendamentos,
            List<Prescricao> prescricaos, List<Prontuario> prontuarios_paciente) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.agendamentos = agendamentos;
        this.prescricaos = prescricaos;
        this.prontuarios_paciente = prontuarios_paciente;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

  
    

    


    




    
}
