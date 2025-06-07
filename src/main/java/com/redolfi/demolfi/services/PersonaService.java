package com.redolfi.demolfi.services;

import com.redolfi.demolfi.entities.Persona;
import com.redolfi.demolfi.repositories.BaseRepository;
import com.redolfi.demolfi.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{
    List<Persona> search(String filtro) throws Exception;

    Page<Persona> search(String filtro, Pageable pageable) throws Exception;
}
