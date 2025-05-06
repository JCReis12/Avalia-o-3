package com.gerenciamentoCidades.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gerenciamentoCidades.entities.Cidades;
import com.gerenciamentoCidades.repository.CidadesRepository;

@Service
public class CidadesService {

	private final CidadesRepository cidadesRepository;
	
	public CidadesService (CidadesRepository cidadesRepository){
		this.cidadesRepository = cidadesRepository;
	}
	
	public List<Cidades> getAllCidades(){
		return cidadesRepository.findAll();
	}
	
	public List<Cidades> getCidadesById(){
		Optional<Cidades> cidadesrepository existeCidades() {
		existeCidades.isPresent	
		}
		return cidadesRepository.findById(id);
	}
	
	public List<Cidades> saveCidades(Cidades cidades){
		return cidadesRepository.save(null);
	}
	
	
	
	
}
