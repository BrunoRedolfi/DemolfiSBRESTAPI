package com.redolfi.demolfi.services;

import com.redolfi.demolfi.entities.Autor;
import com.redolfi.demolfi.repositories.AutorRepository;
import com.redolfi.demolfi.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
