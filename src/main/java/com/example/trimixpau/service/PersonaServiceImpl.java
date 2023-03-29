package com.example.trimixpau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.trimixpau.commons.GenericServiceImpl;
import com.example.trimixpau.dao.PersonaDao;
import com.example.trimixpau.model.Persona;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService {
	
	@Autowired
	private PersonaDao personaDao;
	
	@Override
	public CrudRepository<Persona, Long> getDao() {
		return personaDao;
	}

}
