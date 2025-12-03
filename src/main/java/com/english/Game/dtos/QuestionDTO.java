package com.english.Game.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestionDTO {
    private String question;
    private List<String> alternatives;
    private String correctAnswer;

    public QuestionDTO(String question, List<String> alternatives, String correctAnswer) {
        this.question = question;
        this.alternatives = alternatives;
        this.correctAnswer = correctAnswer;
    }
}
