package com.nes.envite.entities;

import com.nes.envite.entities.enums.PaloCarta;
import com.nes.envite.entities.enums.ValorCarta;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Carta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated
    private PaloCarta palo;
    @Enumerated
    private ValorCarta valor;

    @ManyToOne
    @JoinColumn(name = "baraja_id")
    private Baraja baraja;
}
