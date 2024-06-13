package com.nes.envite.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//@Entity
@Data
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int puntos;

    //@OneToMany(mappedBy = "equipo")
    //private List<Jugador> jugadores;

}
