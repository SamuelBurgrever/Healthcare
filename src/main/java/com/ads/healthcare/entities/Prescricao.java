package com.ads.healthcare.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;

public class Prescricao {
    
    private Integer id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente paciente_prescricao;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Medicamento medicamento;

    public Prescricao(Integer id, Paciente paciente_prescricao, Medicamento medicamento) {
        this.id = id;
        this.paciente_prescricao = paciente_prescricao;
        this.medicamento = medicamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente_prescricao() {
        return paciente_prescricao;
    }

    public void setPaciente_prescricao(Paciente paciente_prescricao) {
        this.paciente_prescricao = paciente_prescricao;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    


}
