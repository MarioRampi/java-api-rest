package com.apidb108.rest.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apidb108.rest.models.Persona;
import com.apidb108.rest.services.PersonaService;

@CrossOrigin("*") // ver opciones
@RestController
public class PersonaController {
	@Autowired
	PersonaService personaService;
	
	@GetMapping("/personas")
	public List<Persona> getAll() {
//		Persona p = new Persona();
//		
//		return new ArrayList<Persona>();
		
		return personaService.traerTodo();
	}
	
	@GetMapping("/personas/{id}")
	public Persona getOne(@PathVariable int id) {
		Persona p = personaService.traerUna(id);
		
		return p;
	}
	
	@PostMapping("/personas")
	public boolean create(@RequestBody Persona p) {
		return personaService.crear(p);
	}
	
	@DeleteMapping("/personas/{id}")
	public boolean remove(@PathVariable int id) {
		
		
		return personaService.borrar(id);
	}
	
	@PutMapping("/personas")
	public boolean update(@RequestBody Persona p) {
		
		return personaService.modificar(p);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
