package com.feliphecosta.sistemarpgmongodb.race.services.impl;

import java.util.List;

import com.feliphecosta.sistemarpgmongodb.race.services.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.race.domain.Race;
import com.feliphecosta.sistemarpgmongodb.race.repository.RaceRepository;

@Service
public class RaceServiceImpl implements RaceService {

	@Autowired
	private RaceRepository _raceRepository;
	
	public List<Race> findAll() {
		return _raceRepository.findAll();
	}
}
