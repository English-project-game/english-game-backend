package com.english.Game.services;

import com.english.Game.dtos.SentenceWordLinkDTO;
import com.english.Game.entities.SentenceWordLinkEntity;
import com.english.Game.repositories.SentenceWordLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SentenceWordLinkService {
    @Autowired
    SentenceWordLinkRepository sentenceWordLinkRepository;

    public void createSentenceWord(SentenceWordLinkDTO sentenceWordLinkDTO) {

        SentenceWordLinkEntity sentence = new SentenceWordLinkEntity();

        sentence.setSentence(sentenceWordLinkDTO.getSentence());
        sentence.setWords(sentenceWordLinkDTO.getWords());

        sentenceWordLinkRepository.save(sentence);
    }

    public List<SentenceWordLinkEntity> listSentences() {
        return sentenceWordLinkRepository.findAll();
    }
}
