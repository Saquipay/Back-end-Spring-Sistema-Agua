package com.ista.sistemagua.Repository;

import com.ista.sistemagua.Model.Consumo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumo, String>{
    
}
