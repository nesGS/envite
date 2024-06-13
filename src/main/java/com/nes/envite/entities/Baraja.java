package com.nes.envite.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class Baraja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; // Ej: Baraja Española, Baraja Francesa, etc.

    @OneToMany(mappedBy = "baraja")
    private List<CartaEnBaraja> cartas;
}