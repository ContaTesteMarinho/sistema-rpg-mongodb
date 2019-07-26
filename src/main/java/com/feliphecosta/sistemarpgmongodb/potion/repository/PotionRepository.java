package com.feliphecosta.sistemarpgmongodb.potion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;

@Repository
public interface PotionRepository extends MongoRepository<Potion, String> {

}
