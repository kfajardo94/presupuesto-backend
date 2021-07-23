package com.presupuesto.backend.impl;

import com.presupuesto.backend.bo.Presupuesto;
import com.presupuesto.backend.service.PresupuestoService;
import com.presupuesto.backend.repository.PresupuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresupuestoServiceImpl implements PresupuestoService {

    @Autowired
    private PresupuestoRepository repository;

    @Override
    public Presupuesto getPresupuestoById(Long id) {
        return repository.getPresupuestoById(id);
    }

    @Override
    public List<Presupuesto> getAll() {
        return repository.findAll();
    }

    @Override
    public Presupuesto create(Presupuesto obj) {
        return repository.save(obj);
    }

    @Override
    public void delete(Long id) {
        Presupuesto obj = repository.getPresupuestoById(id);
        repository.delete(obj);
    }
}
