package com.nes.envite.entities;

import jakarta.persistence.Entity;
import lombok.Data;


@Data
@Entity
public class Carta {

    private long id;
    private String palo;
    private int numero;
    private int valor;
}
