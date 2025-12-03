package com.english.Game.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WordPairDTO {
    private String portuguese;
    private String english;

    public WordPairDTO(String portuguese, String english) {
        this.portuguese = portuguese;
        this.english = english;
    }
}
