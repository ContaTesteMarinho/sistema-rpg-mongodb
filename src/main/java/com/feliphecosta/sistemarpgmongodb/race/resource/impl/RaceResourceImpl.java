package com.feliphecosta.sistemarpgmongodb.race.resource.impl;

import com.feliphecosta.sistemarpgmongodb.race.domain.Race;
import com.feliphecosta.sistemarpgmongodb.race.resource.RaceResource;
import com.feliphecosta.sistemarpgmongodb.race.services.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/races")
public class RaceResourceImpl implements RaceResource {

	@Autowired
	private RaceService _raceService;
	
	@GetMapping
	public ResponseEntity<List<Race>> findAll() {
		return ResponseEntity.ok().body(
				_raceService.findAll()
		);
	}
}
