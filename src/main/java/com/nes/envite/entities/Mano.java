package com.nes.envite.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Mano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "chico_id")
    private Chico chico;
    private boolean arrastre;

    @ManyToOne
    @JoinColumn(name = "ganador_id")
    private Equipo ganador;

    //
    @ManyToOne
    @JoinColumn(name = "mano_jugador_id")
    private Jugador manoJugador;

}
