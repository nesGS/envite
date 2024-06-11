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

    @ManyToOne
    @JoinColumn(name = "ganador")
    private Equipo ganador;
    private boolean state;





}

