package com.nes.envite.entities;

import lombok.Data;

@Data
public class PlayedCard {
    private long id;
    private long game_id;
    private long player_id;
    private long card_id;
    private long round_number;

}
