package com.ista.sistemagua.Repository;

import com.ista.sistemagua.Model.Consumidor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumidorRepository extends JpaRepository<Consumidor, String>{
    
}
