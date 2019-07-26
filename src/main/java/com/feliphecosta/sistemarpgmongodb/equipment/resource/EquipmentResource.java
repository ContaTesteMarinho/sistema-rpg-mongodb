package com.feliphecosta.sistemarpgmongodb.equipment.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;
import com.feliphecosta.sistemarpgmongodb.equipment.services.EquipmentService;

@RestController
@RequestMapping(value="/equipments")
public class EquipmentResource {

	@Autowired
	private EquipmentService equipService;
	
	@GetMapping
	public ResponseEntity<List<Equipment>> findAll() {
		
		List<Equipment> equips = equipService.findAll();  
		
		return ResponseEntity.ok().body(equips);
	}
	
}
