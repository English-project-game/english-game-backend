package com.english.Game.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "sentence_word_links")
public class SentenceWordLinkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSentence;

    @NotBlank
    private String sentence;

    @Column(name = "sentence_portuguese", nullable = false)
    private String sentencePortuguese;

    @ElementCollection
    @CollectionTable(
            name = "sentence_words",
            joinColumns = @JoinColumn(name = "sentence_id")
    )
    @Column(name = "word")
    private List<String> words;
}
