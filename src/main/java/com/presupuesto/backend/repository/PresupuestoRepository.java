package com.presupuesto.backend.repository;

import com.presupuesto.backend.bo.Presupuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresupuestoRepository extends JpaRepository<Presupuesto, Long> {

    Presupuesto getPresupuestoById(Long id);

}
