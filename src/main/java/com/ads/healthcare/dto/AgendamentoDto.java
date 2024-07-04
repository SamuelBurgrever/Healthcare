package com.ads.healthcare.dto;

import com.ads.healthcare.entities.Agendamento;
import com.ads.healthcare.entities.Paciente;

public class AgendamentoDto {
    
    private int id;
    private Paciente paciente;

    public AgendamentoDto(Agendamento agendamento){
        this.id = agendamento.getId();
        this.paciente = agendamento.getPaciente_prescricao();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    


}
