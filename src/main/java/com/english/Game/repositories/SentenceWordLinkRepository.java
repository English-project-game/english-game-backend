package com.english.Game.repositories;

import com.english.Game.entities.SentenceWordLinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentenceWordLinkRepository extends JpaRepository<SentenceWordLinkEntity, Long> {
}
