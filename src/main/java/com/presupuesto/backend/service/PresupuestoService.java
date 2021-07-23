package com.presupuesto.backend.service;

import com.presupuesto.backend.bo.Presupuesto;

import java.util.List;

public interface PresupuestoService {

    Presupuesto getPresupuestoById(Long id);

    List<Presupuesto> getAll();

    Presupuesto create(Presupuesto obj);

    void delete(Long id);
}
