package com.ads.healthcare.dto;

import java.util.Date;

import com.ads.healthcare.entities.Medico;
import com.ads.healthcare.entities.Paciente;
import com.ads.healthcare.entities.Prontuario;

public class ProntuarioDto {
    
    private int id;
    private String registro;
    private Date dataEntrada;
    private Date dataAlta;
    private String convenio;
    private Paciente paciente;
    private Medico medico;

    public ProntuarioDto(Prontuario prontuario){
        this.id = prontuario.getId();
        this.registro = prontuario.getRegistro();
        this.dataEntrada = prontuario.getDataEntrada();
        this.dataAlta = prontuario.getDataAlta();
        this.convenio = prontuario.getConvenio();
        this.paciente = prontuario.getPaciente_prontiario();
        this.medico = prontuario.getMedico_prontuario();
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    


}
