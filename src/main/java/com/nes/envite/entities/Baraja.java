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

    // cascade = CascadeType.ALL: Propaga todas las operaciones (persistencia, fusión, eliminación, etc.)
    @OneToMany(mappedBy = "baraja", cascade = CascadeType.ALL)
    private List<Carta> cartas;
}