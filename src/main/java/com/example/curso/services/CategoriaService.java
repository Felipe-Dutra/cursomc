package com.example.curso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curso.domain.Categoria;
import com.example.curso.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	public Categoria find(Integer id) {  
		Optional<Categoria> obj = repo.findById(id);  
		return obj.orElse(null); 
	}
}
