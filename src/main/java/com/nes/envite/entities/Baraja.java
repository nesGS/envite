package com.nes.envite.entities;

import lombok.Data;

import java.util.List;

@Data
public class Baraja {
    private long id;
    private List<Carta> carta;
}
