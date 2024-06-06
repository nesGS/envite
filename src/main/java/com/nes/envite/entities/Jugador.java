package com.nes.envite.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.Data;

import java.util.List;

@Data
public class Jugador {

    private long id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name="equipo_id")
    private Equipo equipo;

    @Transient
    private List<Carta> cartasJugador;
}
