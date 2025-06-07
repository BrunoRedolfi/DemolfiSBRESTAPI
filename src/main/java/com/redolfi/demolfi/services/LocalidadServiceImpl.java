package com.redolfi.demolfi.services;

import com.redolfi.demolfi.entities.Localidad;
import com.redolfi.demolfi.repositories.BaseRepository;
import com.redolfi.demolfi.repositories.LocalidadRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository) {
        super(baseRepository);
    }
}
