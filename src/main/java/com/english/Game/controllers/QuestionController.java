package com.english.Game.controllers;

import com.english.Game.dtos.QuestionDTO;
import com.english.Game.entities.QuestionEntity;
import com.english.Game.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @PostMapping
        public ResponseEntity<QuestionDTO> createSentence(@RequestBody QuestionDTO questionDTO) {
        questionService.createQuestion(questionDTO);
        return ResponseEntity.ok().body(questionDTO);
    }

    @GetMapping
    public ResponseEntity<List<QuestionEntity>> listQuestions() {
        List<QuestionEntity> questions = questionService.listQuestions();
        return ResponseEntity.ok().body(questions);
    }
}
