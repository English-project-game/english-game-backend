package com.english.Game.controllers;

import com.english.Game.services.StartGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/start")
public class StartGameController {

    @Autowired
    StartGameService startGameService;

    @GetMapping
    public ResponseEntity<List<Object>> startGame() {
        List<Object> startGame = startGameService.gameStarting();
        return ResponseEntity.ok().body(startGame);
    }

}
