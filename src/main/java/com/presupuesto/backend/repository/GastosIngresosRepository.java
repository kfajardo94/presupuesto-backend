package com.presupuesto.backend.repository;

import com.presupuesto.backend.bo.GastosIngresos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GastosIngresosRepository extends JpaRepository<GastosIngresos, Long> {

    GastosIngresos getGastosIngresosById(Long id);
    List<GastosIngresos> getByIdPresupuesto(Long idPresupuesto);

}
