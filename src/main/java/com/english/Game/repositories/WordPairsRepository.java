package com.english.Game.repositories;

import com.english.Game.entities.WordPairEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordPairsRepository extends JpaRepository<WordPairEntity, Long> {
}
