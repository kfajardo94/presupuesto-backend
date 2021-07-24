package com.presupuesto.backend.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "gastosIngresos")
@Getter
@Setter
public class GastosIngresos {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;
    @Column(length = 150)
    private String descripcion;
    @Column
    private Double valor;
    @Column(length = 1)
    private String gastoIngreso;
    @Column
    private Long idPresupuesto;

}
