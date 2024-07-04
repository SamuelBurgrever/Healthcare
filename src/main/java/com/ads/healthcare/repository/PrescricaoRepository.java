package com.ads.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ads.healthcare.entities.Prescricao;

@Repository
public interface PrescricaoRepository extends JpaRepository<Prescricao, Integer> {
    
}
