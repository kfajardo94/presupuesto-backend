package com.presupuesto.backend.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "presupuesto")
@Getter
@Setter
public class Presupuesto {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private Long id;
    @Column(length = 600)
    private String descripcion;
    @Column
    private Double capital;

}
