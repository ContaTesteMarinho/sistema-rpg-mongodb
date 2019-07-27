package com.feliphecosta.sistemarpgmongodb.race.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feliphecosta.sistemarpgmongodb.race.domain.Race;
import com.feliphecosta.sistemarpgmongodb.race.services.RaceService;

@RestController
@RequestMapping(value="/races")
public class RaceResource {

	@Autowired
	private RaceService raceService;
	
	@GetMapping
	public ResponseEntity<List<Race>> findAll() {
		
		List<Race> races = raceService.findAll();
		
		return ResponseEntity.ok().body(races);
	}
	
}
