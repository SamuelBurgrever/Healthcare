package com.ads.healthcare.dto;

import com.ads.healthcare.entities.Paciente;
//teste
public class PacienteDto {
    
    private int id;
    private String nome;
    private String genero;

    public PacienteDto(Paciente paciente){

        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.genero = paciente.getGenero();

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    

}
