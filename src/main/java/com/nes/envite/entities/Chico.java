package com.nes.envite.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Chico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "equipo1_id")
    private Equipo equipo1;

    @ManyToOne
    @JoinColumn(name = "equipo2_id")
    private Equipo equipo2;

    @OneToMany(mappedBy = "partida")
    private List<Mano> manos;

    private Equipo ganador;

    private long current_turn;
    private boolean state;
    private long winner_id;
    private Date created_at;
    private Date updated_at;


}

