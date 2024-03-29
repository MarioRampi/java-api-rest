package com.apidb108.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apidb108.rest.models.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
