package com.feliphecosta.sistemarpgmongodb.race.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feliphecosta.sistemarpgmongodb.race.domain.Race;

@Repository
public interface RaceRepository extends MongoRepository<Race, String> {

}
