package com.ads.healthcare.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Prescricao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente paciente_prescricao;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Medicamento medicamento_prescricao;

    @JsonIgnore
    @OneToMany(mappedBy = "prescricao_faturamento")
    public List<Faturamento> faturamentos;

    

    public Prescricao() {
    }

   

    public Prescricao(Integer id, Paciente paciente_prescricao, Medicamento medicamento_prescricao) {
        this.id = id;
        this.paciente_prescricao = paciente_prescricao;
        this.medicamento_prescricao = medicamento_prescricao;
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
        return medicamento_prescricao;
    }

    public void setMedicamento_prescricao(Medicamento medicamento_prescricao) {
        this.medicamento_prescricao = medicamento_prescricao;
    }

    
   
    


}
