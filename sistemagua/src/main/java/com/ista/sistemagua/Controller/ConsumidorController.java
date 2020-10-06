package com.ista.sistemagua.Controller;

import java.util.List;

import com.ista.sistemagua.Model.Consumidor;
import com.ista.sistemagua.Repository.ConsumidorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/sgap") 
public class ConsumidorController {
    @Autowired
    private ConsumidorRepository consumidorRepository;
    @GetMapping("/consumidor")
    public List <Consumidor> getAllConsumidores(){
        return consumidorRepository.findAll();
    }
}
