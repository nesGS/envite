package com.nes.envite.dao;

import com.nes.envite.entities.Baraja;
import com.nes.envite.entities.Carta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaRepository extends JpaRepository<Carta, Long> {}


