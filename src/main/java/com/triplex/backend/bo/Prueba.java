package com.triplex.backend.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pruebas")
@Getter
@Setter
public class Prueba {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private Long id;
    @Column(length = 50)
    private String nombre;

}
