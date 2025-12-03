package com.english.Game.dtos;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class GameDTO {
    private int score;
    private Long idUser;

    public GameDTO(int score, Long idUser) {
        this.score = score;
        this.idUser = idUser;
    }
}
