package com.feliphecosta.sistemarpgmongodb.equipment.services.impl;

import java.util.List;

import com.feliphecosta.sistemarpgmongodb.equipment.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;
import com.feliphecosta.sistemarpgmongodb.equipment.repository.EquipmentRepository;

@Service
public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	private EquipmentRepository _equipmentRepository;
	
	public List<Equipment> findAll() {
		return _equipmentRepository.findAll();
	}
}
