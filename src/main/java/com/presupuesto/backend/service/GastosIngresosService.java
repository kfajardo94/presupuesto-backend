package com.presupuesto.backend.service;

import com.presupuesto.backend.bo.GastosIngresos;

import java.util.List;

public interface GastosIngresosService {

    GastosIngresos getGastosIngresosById(Long id);

    List<GastosIngresos> getByIdPresupuesto(Long idPresupuesto);

    List<GastosIngresos> getAll();

    GastosIngresos create(GastosIngresos obj);

    List<GastosIngresos> delete(Long id, Long idPresupuesto);
}
