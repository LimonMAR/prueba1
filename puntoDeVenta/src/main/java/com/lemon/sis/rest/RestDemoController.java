package com.lemon.sis.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lemon.sis.model.Persona;
import com.lemon.sis.repo.IPersonaRepo;


@RestController
@RequestMapping("/persona")
public class RestDemoController {
	
	@Autowired
	private IPersonaRepo iPersonaRepo;
	
	@GetMapping
	public List<Persona> listar() {	
		return iPersonaRepo.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody Persona persona) {	
		iPersonaRepo.save(persona);
	}

	@PutMapping
	public void modificar(@RequestBody Persona persona) {	
		 iPersonaRepo.save(persona);
	}

	@DeleteMapping(value= "/{id}")
	public void modificar(@PathVariable("id") Integer id) {	
		 iPersonaRepo.deleteById(id);
	}
	
}
