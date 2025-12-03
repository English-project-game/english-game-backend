package com.english.Game.controllers;

import com.english.Game.dtos.SentenceWordLinkDTO;
import com.english.Game.entities.SentenceWordLinkEntity;
import com.english.Game.services.SentenceWordLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/sentences")
public class SentenceWordLinkController {
    @Autowired
    SentenceWordLinkService sentenceWordLinkService;

    @PostMapping
    public ResponseEntity<SentenceWordLinkDTO> createSentence(@RequestBody SentenceWordLinkDTO sentenceWordLinkDTO) {
        sentenceWordLinkService.createSentenceWord(sentenceWordLinkDTO);
        return ResponseEntity.ok().body(sentenceWordLinkDTO);
    }

    @GetMapping
    public ResponseEntity<List<SentenceWordLinkEntity>> listSentences() {
        List<SentenceWordLinkEntity> sentences = sentenceWordLinkService.listSentences();
        return ResponseEntity.ok().body(sentences);
    }
}
