package com.english.Game.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
    private String userName;

    public UserDTO(String userName) {
        this.userName = userName;
    }
}

