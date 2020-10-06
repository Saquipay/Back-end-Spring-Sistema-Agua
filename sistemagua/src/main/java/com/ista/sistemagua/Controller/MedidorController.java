package com.ista.sistemagua.Controller;

import java.util.List;

import com.ista.sistemagua.Model.Medidor;
import com.ista.sistemagua.Repository.MedidorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/sgap") 

public class MedidorController {
   @Autowired
   private MedidorRepository medidorRepository;
   @GetMapping("/medidor")
   public List <Medidor> getAllConsumidores(){
       return medidorRepository.findAll();
   }

   }
