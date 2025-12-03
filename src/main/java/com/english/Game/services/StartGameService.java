package com.english.Game.services;

import com.english.Game.entities.QuestionEntity;
import com.english.Game.entities.SentenceWordLinkEntity;
import com.english.Game.entities.WordPairEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@Service
public class StartGameService {

    @Autowired
    QuestionService questionService;

    @Autowired
    WordPairService wordPairService;

    @Autowired
    SentenceWordLinkService sentenceWordLinkService;

    private final Random random = new Random();

    public List<Object> gameStarting() {

        List<Object> gameElements = new ArrayList<>(5);
        while (gameElements.size() < 5) gameElements.add(null);

        List<QuestionEntity> questions = questionService.listQuestions();
        List<WordPairEntity> wordPairs = wordPairService.listWords();
        List<SentenceWordLinkEntity> sentenceWordLinks = sentenceWordLinkService.listSentences();

        gameElements.set(0, getRandomElement(questions));

        List<SentenceWordLinkEntity> randomSentenceLinks = getRandomUniqueElements(sentenceWordLinks);
        gameElements.set(1, randomSentenceLinks.get(0));
        gameElements.set(2, randomSentenceLinks.get(1));

        List<WordPairEntity> randomWordPairs = getRandomUniqueElements(wordPairs);
        gameElements.set(3, randomWordPairs.get(0));
        gameElements.set(4, randomWordPairs.get(1));

        return gameElements;
    }

    private <T> T getRandomElement(List<T> list) {
        return list.get(random.nextInt(list.size()));
    }

    private <T> List<T> getRandomUniqueElements(List<T> list) {
        List<T> copy = new ArrayList<>(list);
        Collections.shuffle(copy);
        return copy.subList(0, 5);
    }
}
