package com.ista.sistemagua.Controller;

import java.util.List;

import com.ista.sistemagua.Exception.ResourceNotFoundException;
import com.ista.sistemagua.Model.Medidor;
import com.ista.sistemagua.Repository.MedidorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/sgap")

public class MedidorController {
    @Autowired
    private MedidorRepository medidorRepository;

    @GetMapping("/medidor")
    public List<Medidor> getAllConsumidores() {
        return medidorRepository.findAll();
    }
    @GetMapping("/medidor/{id}")
	public ResponseEntity<Medidor> getMedidorById(@PathVariable(value = "id") String id)
			throws ResourceNotFoundException {
		Medidor medidor = medidorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Medidor not found for this id :: " + id));
		return ResponseEntity.ok().body(medidor);
    }
    @PutMapping("/medidor/{id}")
	public ResponseEntity<Medidor> updateMedidor(@PathVariable(value = "id") String id,
			@RequestBody Medidor medidorDetails) throws ResourceNotFoundException {
		    Medidor medidor = medidorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Medidor not found for this id :: " + id));

        medidor.setId(medidorDetails.getId());
        medidor.setFecha_instalacion(medidorDetails.getFecha_instalacion());
        medidor.setMarca(medidorDetails.getMarca());
		final Medidor updatedMedidor = medidorRepository.save(medidor);
		return ResponseEntity.ok(updatedMedidor);
	}

}
