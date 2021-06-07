package com.feliphecosta.sistemarpgmongodb.race.services;

import com.feliphecosta.sistemarpgmongodb.race.domain.Race;

import java.util.List;

public interface RaceService {

    List<Race> findAll();
}
