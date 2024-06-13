package com.nes.envite.service;


import com.nes.envite.dao.BarajaRepository;
import com.nes.envite.dao.CartaRepository;
import com.nes.envite.entities.Baraja;
import org.springframework.beans.factory.annotation.Autowired;

public class BarajaServiceImp implements BarajaService{

    @Autowired
    private BarajaRepository barajaRepository;

    @Autowired
    private CartaRepository cartaRepository;



    @Override
    public Baraja nuevaBaraja() {
        return null;
    }

    @Override
    public Baraja barajar() {
        return null;
    }

    @Override
    public Baraja repartir() {
        return null;
    }



/*    @Transactional
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
    }*/
}

