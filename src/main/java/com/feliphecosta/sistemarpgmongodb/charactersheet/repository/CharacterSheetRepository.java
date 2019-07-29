package com.feliphecosta.sistemarpgmongodb.charactersheet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feliphecosta.sistemarpgmongodb.charactersheet.domain.CharacterSheet;

@Repository
public interface CharacterSheetRepository extends MongoRepository<CharacterSheet, String> {

}
