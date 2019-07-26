package com.feliphecosta.sistemarpgmongodb.potion.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;
import com.feliphecosta.sistemarpgmongodb.potion.services.PotionService;

@RestController
@RequestMapping(value="/potions")
public class PotionResource {

	@Autowired
	private PotionService potionService;
	
	@GetMapping
	public ResponseEntity<List<Potion>> findAll() {
		
		List<Potion> potions = potionService.findAll();
		
		return ResponseEntity.ok().body(potions);
	}
}
