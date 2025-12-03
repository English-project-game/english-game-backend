package com.english.Game.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "questions")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuestion;

    @NotBlank
    private String question;

    @ElementCollection
    @CollectionTable(
            name = "question_alternatives",
            joinColumns = @JoinColumn(name = "question_id")
    )
    @Column(name = "alternative")
    private List<String> alternatives;

    @NotBlank
    private String correctAnswer;
}
