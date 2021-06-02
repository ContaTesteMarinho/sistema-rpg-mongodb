package com.feliphecosta.sistemarpgmongodb.equipment.resource.impl;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;
import com.feliphecosta.sistemarpgmongodb.equipment.resource.EquipmentResource;
import com.feliphecosta.sistemarpgmongodb.equipment.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/equipments")
public class EquipmentResourceImpl implements EquipmentResource {

	@Autowired
	private EquipmentService _equipmentService;
	
	@GetMapping
	public ResponseEntity<List<Equipment>> findAll() {
		return ResponseEntity.ok().body(
				_equipmentService.findAll()
		);
	}
}
