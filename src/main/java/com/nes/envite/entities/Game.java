package com.nes.envite.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Game {
    private long id;
    private long player1_id;
    private long player2_id;
    private long current_turn;
    private boolean state;
    private long winner_id;
    private Date created_at;
    private Date updated_at;


}

