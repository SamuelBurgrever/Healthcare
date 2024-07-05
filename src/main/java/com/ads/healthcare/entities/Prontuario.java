package com.ads.healthcare.entities;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Prontuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String registro;
    private Date dataEntrada;
    private Date dataAlta;
    private String convenio;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Paciente paciente_prontiario;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Medico medico_prontuario;

    public Prontuario(int id, String registro, Date dataEntrada, Date dataAlta, String convenio,
            Paciente paciente_prontiario, Medico medico_prontuario) {
        this.id = id;
        this.registro = registro;
        this.dataEntrada = dataEntrada;
        this.dataAlta = dataAlta;
        this.convenio = convenio;
        this.paciente_prontiario = paciente_prontiario;
        this.medico_prontuario = medico_prontuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public Paciente getPaciente_prontiario() {
        return paciente_prontiario;
    }

    public void setPaciente_prontiario(Paciente paciente_prontiario) {
        this.paciente_prontiario = paciente_prontiario;
    }

    public Medico getMedico_prontuario() {
        return medico_prontuario;
    }

    public void setMedico_prontuario(Medico medico_prontuario) {
        this.medico_prontuario = medico_prontuario;
    }

    

    

}
