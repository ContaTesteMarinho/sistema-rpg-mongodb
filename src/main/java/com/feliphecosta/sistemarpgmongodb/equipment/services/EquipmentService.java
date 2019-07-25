package com.feliphecosta.sistemarpgmongodb.equipment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;
import com.feliphecosta.sistemarpgmongodb.equipment.repository.EquipmentRepository;

@Service
public class EquipmentService {

	@Autowired
	private EquipmentRepository equipmentRepo;
	
	public List<Equipment> findAll() {
		return equipmentRepo.findAll();
	}
}
