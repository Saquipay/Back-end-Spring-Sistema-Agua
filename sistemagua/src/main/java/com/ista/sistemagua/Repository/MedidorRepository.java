package com.ista.sistemagua.Repository;

import com.ista.sistemagua.Model.Medidor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedidorRepository extends JpaRepository<Medidor, String>{
    
}
