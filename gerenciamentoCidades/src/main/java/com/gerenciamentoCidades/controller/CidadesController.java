package com.gerenciamentoCidades.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciamentoCidades.entities.Cidades;
import com.gerenciamentoCidades.service.CidadesService;

@RestController
@RequestMapping("/cidade")
public class CidadesController {
	private final CidadesService cidadesService;
	
	public CidadesController (CidadesService cidadesService){
		this.cidadesService = cidadesService;
	}

	@GetMapping("/")
	public ResponseEntity <Cidades> getAllCidades(){
		return ResponseEntity.ok().build();
	}
	return ResponseEntity.notFound();
	
	@PutMapping("/")
	
	@GetMapping("/{id}")
	
	@DeleteMapping("/{id}")
}
