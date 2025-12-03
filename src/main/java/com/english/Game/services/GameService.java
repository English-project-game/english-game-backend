package com.english.Game.services;

import com.english.Game.dtos.GameDTO;
import com.english.Game.entities.GameEntity;
import com.english.Game.entities.UserEntity;
import com.english.Game.repositories.GameRepository;
import com.english.Game.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    @Autowired
    UserRepository userRepository;

    public void createGame(GameDTO gameDTO) {

        GameEntity game = new GameEntity();

        UserEntity user = userRepository.findById(gameDTO.getIdUser())
                .orElseThrow(() -> new RuntimeException("User not found"));

        game.setUser(user);
        game.setScore(gameDTO.getScore());

        gameRepository.save(game);
    }


    public List<GameEntity> listHistoricGames() {
        return gameRepository.findAll();
    }
}
