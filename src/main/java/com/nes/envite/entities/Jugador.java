package com.nes.envite.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//@Entity
@Data
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;

    //@ManyToOne
    //@JoinColumn(name="equipo_id")
    private Equipo equipo;

    //@Transient
    //private List<Carta> cartasJugador;
}
