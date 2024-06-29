package com.ads.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ads.healthcare.entities.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {

}