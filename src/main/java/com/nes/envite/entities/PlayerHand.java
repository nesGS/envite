package com.nes.envite.entities;

import lombok.Data;

@Data
public class PlayerHand {
    private long id;
    private long player_id;
    private long game_id;
    private long card_id;

}
