package com.nes.envite.service;


import com.nes.envite.dao.BarajaRepository;
import com.nes.envite.dao.CartaEnBarajaRepository;
import com.nes.envite.dao.CartaRepository;
import com.nes.envite.entities.Baraja;
import com.nes.envite.entities.Carta;
import com.nes.envite.entities.CartaEnBaraja;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

public class BarajaServiceImp {

    @Autowired
    private CartaRepository cartaRepository;

    @Autowired
    private BarajaRepository barajaRepository;

    @Autowired
    private CartaEnBarajaRepository cartaEnBarajaRepository;

    @Transactional
    public void crearBarajaConCartas() {
        Baraja baraja = new Baraja();
        baraja.setNombre("Baraja Española");
        barajaRepository.save(baraja);

        // Crear y añadir cartas
        for (int i = 1; i <= 10; i++) {
            Carta carta = new Carta();
            carta.setPalo("Espadas");
            carta.setNumero(i);
            carta.setValor(i); // El valor puede depender de las reglas del juego
            cartaRepository.save(carta);

            CartaEnBaraja cartaEnBaraja = new CartaEnBaraja();
            cartaEnBaraja.setCarta(carta);
            cartaEnBaraja.setBaraja(baraja);
            cartaEnBaraja.setPosicion(i);
            cartaEnBarajaRepository.save(cartaEnBaraja);
        }
    }
}

