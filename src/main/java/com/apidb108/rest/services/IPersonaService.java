package com.apidb108.rest.services;

import java.util.List;

import com.apidb108.rest.models.Persona;

public interface IPersonaService {

	List<Persona> traerTodo();
	Persona traerUna(long id);
	boolean crear(Persona p);
	boolean modificar(Persona p);
	boolean borrar(long id);
}
