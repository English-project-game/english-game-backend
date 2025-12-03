package com.english.Game.services;

import com.english.Game.dtos.WordPairDTO;
import com.english.Game.entities.WordPairEntity;
import com.english.Game.repositories.WordPairsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordPairService {
    @Autowired
    WordPairsRepository wordPairsRepository;

    public void createPairWord(WordPairDTO wordPairDTO) {

        WordPairEntity wordPair = new WordPairEntity();

        wordPair.setPortuguese(wordPairDTO.getPortuguese());
        wordPair.setEnglish(wordPairDTO.getEnglish());

        wordPairsRepository.save(wordPair);
    }

    public List<WordPairEntity> listWords() {
        return wordPairsRepository.findAll();
    }
}
