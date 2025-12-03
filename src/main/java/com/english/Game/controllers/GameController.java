package com.english.Game.controllers;

import com.english.Game.dtos.GameDTO;
import com.english.Game.entities.GameEntity;
import com.english.Game.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    GameService gameService;

    @PostMapping
    public ResponseEntity<GameDTO> createGame(@RequestBody GameDTO gameDTO) {
        gameService.createGame(gameDTO);
        return ResponseEntity.ok().body(gameDTO);
    }

    @GetMapping
    public ResponseEntity<List<GameEntity>> listQuestions() {
        List<GameEntity> games = gameService.listHistoricGames();
        return ResponseEntity.ok().body(games);
    }
}
