package com.ads.healthcare.dto;

import com.ads.healthcare.entities.Faturamento;
import com.ads.healthcare.entities.Material;
import com.ads.healthcare.entities.Prescricao;
import com.ads.healthcare.entities.Procedimento;



public class FaturamentoDto {
    
    private int id;
    private Double valorTotal;
    private Material material;
    private Procedimento procedimento;
    private Prescricao prescricao;

    
    public FaturamentoDto(Faturamento faturamento) {
        this.id = faturamento.getId();
        this.valorTotal = faturamento.getValorTotal();
        this.material = faturamento.getMaterial_faturamento();
        this.procedimento = faturamento.getProcedimento_faturamento();
        this.prescricao = faturamento.getPrescricao_faturamento();
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


    public Material getMaterial() {
        return material;
    }


    public void setMaterial(Material material) {
        this.material = material;
    }


    public Procedimento getProcedimento() {
        return procedimento;
    }


    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }


    public Prescricao getPrescricao() {
        return prescricao;
    }


    public void setPrescricao(Prescricao prescricao) {
        this.prescricao = prescricao;
    } 


    
}
