package com.feliphecosta.sistemarpgmongodb.weapon.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;
import com.feliphecosta.sistemarpgmongodb.weapon.services.WeaponService;

@RestController
@RequestMapping(value="/weapons")
public class WeaponResource {

	@Autowired
	private WeaponService weaponService;
	
	@GetMapping
	public ResponseEntity<List<Weapon>> findAll() {
		
		List<Weapon> weapons = weaponService.findAll();
		
		return ResponseEntity.ok().body(weapons);
	}
}
