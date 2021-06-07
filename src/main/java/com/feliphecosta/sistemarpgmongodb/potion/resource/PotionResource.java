package com.feliphecosta.sistemarpgmongodb.potion.resource;

import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PotionResource {

    ResponseEntity<List<Potion>> findAll();
}
