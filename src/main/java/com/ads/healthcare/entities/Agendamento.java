package com.ads.healthcare.entities;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Agendamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date data;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente paciente_prescricao;

    public Agendamento(int id, Date data, Paciente paciente_prescricao) {
        this.id = id;
        this.data = data;
        this.paciente_prescricao = paciente_prescricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Paciente getPaciente_prescricao() {
        return paciente_prescricao;
    }

    public void setPaciente_prescricao(Paciente paciente_prescricao) {
        this.paciente_prescricao = paciente_prescricao;
    }


    
    
}
