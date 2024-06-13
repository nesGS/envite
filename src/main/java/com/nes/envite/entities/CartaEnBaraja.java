package com.nes.envite.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CartaEnBaraja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "carta_id")
    private Carta carta;

    @ManyToOne
    @JoinColumn(name = "baraja_id")
    private Baraja baraja;

    private int posicion; // Para almacenar la posición de la carta en la baraja
}