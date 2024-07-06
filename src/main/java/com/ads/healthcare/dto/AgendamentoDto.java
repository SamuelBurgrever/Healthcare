package com.ads.healthcare.dto;

import java.util.Date;

import com.ads.healthcare.entities.Agendamento;
import com.ads.healthcare.entities.Paciente;

public class AgendamentoDto {
    
    private int id;
    private Date data;
    private Paciente paciente;

    public AgendamentoDto(Agendamento agendamento){
        this.id = agendamento.getId();
        this.paciente = agendamento.getPaciente_agendamento();
        this.data = agendamento.getData();
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    
    

    

    


}
