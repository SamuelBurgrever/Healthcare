package com.ads.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ads.healthcare.entities.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}
