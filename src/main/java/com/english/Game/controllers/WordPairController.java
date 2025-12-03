package com.english.Game.controllers;

import com.english.Game.dtos.WordPairDTO;
import com.english.Game.entities.WordPairEntity;
import com.english.Game.services.WordPairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/words-pairs")
public class WordPairController {
    @Autowired
    WordPairService wordPairService;

    @PostMapping
    public ResponseEntity<WordPairDTO> createWordPair(@RequestBody WordPairDTO wordPairDTO) {
        wordPairService.createPairWord(wordPairDTO);
        return ResponseEntity.ok().body(wordPairDTO);
    }

    @GetMapping
    public ResponseEntity<List<WordPairEntity>> getAll() {
        List<WordPairEntity> words = wordPairService.listWords();
        return ResponseEntity.ok().body(words);
    }
}
