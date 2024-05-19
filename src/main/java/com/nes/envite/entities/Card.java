package com.nes.envite.entities;

import lombok.Data;

@Data
public class Card {
    private long id;
    private int value;
    private String suit; //Palo de la carta (oros, copas, espadas, bastos)
}
