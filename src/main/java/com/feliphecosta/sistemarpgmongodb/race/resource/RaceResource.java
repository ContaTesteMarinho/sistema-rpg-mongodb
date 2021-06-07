package com.feliphecosta.sistemarpgmongodb.race.resource;

import com.feliphecosta.sistemarpgmongodb.race.domain.Race;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RaceResource {

    ResponseEntity<List<Race>> findAll();
}
