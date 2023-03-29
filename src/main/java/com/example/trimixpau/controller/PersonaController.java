package com.example.trimixpau.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trimixpau.model.Persona;
import com.example.trimixpau.service.PersonaService;

@RestController
@RequestMapping(value = "/api/v1/")
@CrossOrigin("*")
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@GetMapping(value = "/all")
	public List<Persona> getAll() {
		return personaService.getAll();
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<Persona> save(@RequestBody Persona persona) {
		Persona obj = personaService.save(persona);
		return new ResponseEntity<Persona>(obj, HttpStatus.OK);
	}

	@GetMapping(value = "/delete/{perId}")
	public ResponseEntity<Persona> delete(@PathVariable Long perId) {
		Persona persona = personaService.get(perId);
		if (persona != null) {
			personaService.delete(perId);
		} else {
			return new ResponseEntity<Persona>(persona, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Persona>(persona, HttpStatus.OK);
	}

}