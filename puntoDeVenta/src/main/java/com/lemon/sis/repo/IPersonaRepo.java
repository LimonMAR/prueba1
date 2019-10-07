package com.lemon.sis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lemon.sis.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
