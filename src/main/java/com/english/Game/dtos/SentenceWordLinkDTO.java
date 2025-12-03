package com.english.Game.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SentenceWordLinkDTO {
    private String sentence;
    private String sentencePortuguese;
    private List<String> words;

    public SentenceWordLinkDTO(String sentence, String sentencePortuguese, List<String> words) {
        this.sentence = sentence;
        this.sentencePortuguese = sentencePortuguese;
        this.words = words;
    }
}
