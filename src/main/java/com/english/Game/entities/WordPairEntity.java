package com.english.Game.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "word_pairs")
public class WordPairEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_word_pair")
    private Long idWordPair;

    @NotBlank
    private String portuguese;

    @NotBlank
    private String english;
}
