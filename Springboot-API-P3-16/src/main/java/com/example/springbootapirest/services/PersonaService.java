package com.example.springbootapirest.services;

import com.example.springbootapirest.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonaService extends BaseService<Persona, Long> {

    Page<Persona> search(String filtro, Pageable pageable) throws Exception;

}
