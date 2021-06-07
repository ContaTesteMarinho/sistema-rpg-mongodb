package com.feliphecosta.sistemarpgmongodb.potion.resource.impl;

import java.util.List;

import com.feliphecosta.sistemarpgmongodb.potion.resource.PotionResource;
import com.feliphecosta.sistemarpgmongodb.potion.services.PotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;

@RestController
@RequestMapping(value="/potions")
public class PotionResourceImpl implements PotionResource {

	@Autowired
	private PotionService _potionService;
	
	@GetMapping
	public ResponseEntity<List<Potion>> findAll() {
		return ResponseEntity.ok().body(
				_potionService.findAll()
		);
	}
}
