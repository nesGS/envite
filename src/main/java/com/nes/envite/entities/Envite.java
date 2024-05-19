package com.nes.envite.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Envite {
    private long id;
    private long game_id;
    private long player_id;
    private int amount; //Cantidades apostadas
    private boolean status; //Estado de la apuesta
    private Date created_at;

}
