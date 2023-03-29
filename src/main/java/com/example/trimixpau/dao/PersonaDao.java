package com.example.trimixpau.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.trimixpau.model.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
