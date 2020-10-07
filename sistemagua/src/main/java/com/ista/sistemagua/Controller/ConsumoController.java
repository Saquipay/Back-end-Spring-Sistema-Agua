package com.ista.sistemagua.Controller;

import java.util.List;

import com.ista.sistemagua.Model.Consumo;
import com.ista.sistemagua.Repository.ConsumoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/sgap") 
public class ConsumoController {
    @Autowired
    private ConsumoRepository consumidorRepository;
    @GetMapping("/consumo")
    public List <Consumo> getAllConsumidores(){
        return consumidorRepository.findAll();
    }
}
