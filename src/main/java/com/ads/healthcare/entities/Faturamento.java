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
}
