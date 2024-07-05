package com.ads.healthcare.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Faturamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private Double valorTotal;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Material material_faturamento;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Procedimento procedimento_faturamento;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Prescricao prescricao_faturamento;

    public Faturamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Material getMaterial_faturamento() {
        return material_faturamento;
    }

    public void setMaterial_faturamento(Material material_faturamento) {
        this.material_faturamento = material_faturamento;
    }

    public Procedimento getProcedimento_faturamento() {
        return procedimento_faturamento;
    }

    public void setProcedimento_faturamento(Procedimento procedimento_faturamento) {
        this.procedimento_faturamento = procedimento_faturamento;
    }

    public Prescricao getPrescricao_faturamento() {
        return prescricao_faturamento;
    }

    public void setPrescricao_faturamento(Prescricao prescricao_faturamento) {
        this.prescricao_faturamento = prescricao_faturamento;
    }

    

    
}
