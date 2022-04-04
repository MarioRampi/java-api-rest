package com.apidb108.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apidb108.rest.models.Persona;
import com.apidb108.rest.repositories.PersonaRepository;

@Service
public class PersonaService implements IPersonaService {
	/**
	 * ACA LOGICA DE NEGOCIOS
	 */
	// TODO MODIFICAR RESPUESTA DE METODOS
	@Autowired
	PersonaRepository personaRepo;
	
	@Override
	public List<Persona> traerTodo() {
		// TODO Auto-generated method stub
		return personaRepo.findAll();
	}

	@Override
	public Persona traerUna(long id) {
		// TODO Auto-generated method stub
		return personaRepo.findById(id).orElse(null);
	}

	@Override
	public boolean crear(Persona p) {
		// TODO Auto-generated method stub
//		Persona _p = 
		personaRepo.save(p);
		
		return true;
	}

	@Override
	public boolean modificar(Persona p) {
		// TODO Auto-generated method stub
		personaRepo.save(p);
		
		return true;
	}

	@Override
	public boolean borrar(long id) {
		// TODO Auto-generated method stub
		personaRepo.deleteById(id);
		
		return true;
	}

}
