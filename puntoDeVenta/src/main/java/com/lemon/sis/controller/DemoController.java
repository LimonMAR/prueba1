package com.lemon.sis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lemon.sis.model.Persona;
import com.lemon.sis.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo iPersonarepo;
	
	@GetMapping("/insertaPersona")
	public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model) {
		
		Persona persona = new Persona();
		persona.setId(4);
		persona.setNombre("dan");
		persona.setPrimerApellido("diaz");
		persona.setSegundoApellido("rojas");
		persona.setTelefono("5549816761");
		
		iPersonarepo.save(persona);
		
		model.addAttribute("name",model);
		return "greeting";
	}

}
