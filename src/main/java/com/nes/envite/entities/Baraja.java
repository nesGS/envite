package com.nes.envite.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
public class Baraja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private List<Carta> carta;
}
