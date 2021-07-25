package com.presupuesto.backend.impl;

import com.presupuesto.backend.bo.GastosIngresos;
import com.presupuesto.backend.repository.GastosIngresosRepository;
import com.presupuesto.backend.service.GastosIngresosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastosIngresosServiceImpl implements GastosIngresosService {

    @Autowired
    private GastosIngresosRepository repository;

    @Override
    public GastosIngresos getGastosIngresosById(Long id) {
        return repository.getGastosIngresosById(id);
    }

    @Override
    public List<GastosIngresos> getByIdPresupuesto(Long idPresupuesto) {
        return repository.getByIdPresupuesto(idPresupuesto);
    }

    @Override
    public List<GastosIngresos> getAll() {
        return repository.findAll();
    }

    @Override
    public GastosIngresos create(GastosIngresos obj) {
        return repository.save(obj);
    }

    @Override
    public List<GastosIngresos> delete(Long id, Long idPresupuesto) {
        GastosIngresos obj = repository.getGastosIngresosById(id);
        repository.delete(obj);
        return getByIdPresupuesto(idPresupuesto);
    }
}
