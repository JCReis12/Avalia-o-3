package com.gerenciamentoCidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciamentoCidades.entities.Cidades;

public interface CidadesRepository extends JpaRepository<Cidades, Long>{

}
