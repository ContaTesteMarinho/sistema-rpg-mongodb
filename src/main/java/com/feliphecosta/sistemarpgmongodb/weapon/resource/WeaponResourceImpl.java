package com.feliphecosta.sistemarpgmongodb.weapon.resource;

import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;
import com.feliphecosta.sistemarpgmongodb.weapon.services.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/weapons")
public class WeaponResourceImpl implements WeaponResource {

	@Autowired
	private WeaponService _weaponService;
	
	@GetMapping
	public ResponseEntity<List<Weapon>> findAll() {
		return ResponseEntity.ok().body(
				_weaponService.findAll()
		);
	}
}
