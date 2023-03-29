package com.example.trimixpau.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import java.util.List;
import static java.util.Collections.singletonList;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.example.trimixpau.model.Persona;


@RunWith(SpringRunner.class)
@WebMvcTest(value = PersonaController.class)
public class PersonaControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private PersonaController personaController;

	@Test
	public void getAllTest() throws Throwable {
		Persona persona = new Persona();
		persona.setPerApellido("apellido");
		persona.setPerNombre("nombre");
		persona.setPerNumeroDocumento((long)1234567);
		
		List<Persona> allPersonas = singletonList(persona);
		
		given(personaController.getAll()).willReturn(allPersonas);
		
		mvc.perform(get("http://localhost:8080/api/v1/all")
				.contentType(APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", hasSize(1)));
		
		
	}

}
