package com.feliphecosta.sistemarpgmongodb.equipment.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;

@RestController
@RequestMapping(value="/equipments")
public class EquipmentResource {

	@GetMapping
	public ResponseEntity<List<Equipment>> findAll() {
		
		Equipment equip1 = new Equipment("1", "Botas de couro", "a", 2, "Comum", " ", 40.50);
		Equipment equip2 = new Equipment("2", "Chapeu de palha", "a", 1, "Comum", " ", 10.0);
		List<Equipment> equips = new ArrayList<>();
		
		equips.addAll(Arrays.asList(equip1, equip2));
		
		return ResponseEntity.ok().body(equips);
	}
	
}
