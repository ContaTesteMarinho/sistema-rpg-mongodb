package com.feliphecosta.sistemarpgmongodb.player.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feliphecosta.sistemarpgmongodb.player.domain.Player;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {

}
