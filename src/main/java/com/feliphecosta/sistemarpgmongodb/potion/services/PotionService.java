package com.feliphecosta.sistemarpgmongodb.potion.services;

import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;

import java.util.List;

public interface PotionService {

    List<Potion> findAll();
}
