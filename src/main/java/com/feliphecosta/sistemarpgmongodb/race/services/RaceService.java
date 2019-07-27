package com.feliphecosta.sistemarpgmongodb.race.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.race.domain.Race;
import com.feliphecosta.sistemarpgmongodb.race.repository.RaceRepository;

@Service
public class RaceService {

	@Autowired
	private RaceRepository raceRepo;
	
	public List<Race> findAll() {
		
		List<Race> races = raceRepo.findAll();
		
		return races;
	}
}
