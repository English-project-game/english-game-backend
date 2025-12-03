package com.english.Game.services;

import com.english.Game.dtos.QuestionDTO;
import com.english.Game.entities.QuestionEntity;
import com.english.Game.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    public void createQuestion(QuestionDTO questionDTO) {

        QuestionEntity question = new QuestionEntity();

        question.setQuestion(questionDTO.getQuestion());
        question.setAlternatives(questionDTO.getAlternatives());
        question.setCorrectAnswer(questionDTO.getCorrectAnswer());

        questionRepository.save(question);
    }

    public List<QuestionEntity> listQuestions() {
        return questionRepository.findAll();
    }
}
