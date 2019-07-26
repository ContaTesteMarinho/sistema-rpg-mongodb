package com.feliphecosta.sistemarpgmongodb.weapon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;

@Repository
public interface WeaponRepository extends MongoRepository<Weapon, String> {

}
