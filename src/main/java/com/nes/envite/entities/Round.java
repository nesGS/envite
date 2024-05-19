package com.nes.envite.entities;

import lombok.Data;

@Data
public class Round {
    private long id;
    private long game_id;
    private long number;
    private long winner_id;
    private long played_cards;

}
