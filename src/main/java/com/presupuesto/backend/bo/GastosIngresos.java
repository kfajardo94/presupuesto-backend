package com.presupuesto.backend.bo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class GastosIngresos {


    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;

}
