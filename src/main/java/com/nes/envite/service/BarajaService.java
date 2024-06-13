package com.nes.envite.service;

import com.nes.envite.entities.Baraja;

public interface BarajaService {

    // Crea baraja inicial
    Baraja nuevaBaraja();

    // Mezcla las cartas
    Baraja barajar();

    // Reparte 3 a cada jugador (evitando que sean duplicadas) y muestra vira
    Baraja repartir();







}
