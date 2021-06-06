package com.triplex.backend.repository;

import com.triplex.backend.bo.Prueba;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PruebaRepository extends JpaRepository<Prueba, Long> {

    Prueba getPruebaById(Long id);

}
