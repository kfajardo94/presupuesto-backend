package com.triplex.backend.impl;

import com.triplex.backend.bo.Prueba;
import com.triplex.backend.repository.PruebaRepository;
import com.triplex.backend.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PruebaServiceImpl implements PruebaService {

    @Autowired
    private PruebaRepository repository;

    @Override
    public Prueba getPruebaById(Long id) {
        return repository.getPruebaById(id);
    }
}
