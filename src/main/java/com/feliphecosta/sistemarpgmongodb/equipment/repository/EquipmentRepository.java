package com.feliphecosta.sistemarpgmongodb.equipment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;

@Repository
public interface EquipmentRepository extends MongoRepository<Equipment, String> {
	
}
