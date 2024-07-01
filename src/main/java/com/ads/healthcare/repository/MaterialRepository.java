package com.ads.healthcare.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ads.healthcare.entities.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {

}