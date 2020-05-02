package com.example.curso.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.domain.Categoria;
import com.example.curso.services.CategoriaService;

@RestController
@RequestMapping(value="categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find( Integer id) {
	
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
