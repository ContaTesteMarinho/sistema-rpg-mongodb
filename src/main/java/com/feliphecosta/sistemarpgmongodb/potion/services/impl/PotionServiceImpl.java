package com.feliphecosta.sistemarpgmongodb.potion.services.impl;

import java.util.List;

import com.feliphecosta.sistemarpgmongodb.potion.services.PotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;
import com.feliphecosta.sistemarpgmongodb.potion.repository.PotionRepository;

@Service
public class PotionServiceImpl implements PotionService {

	@Autowired
	private PotionRepository _potionRepository;
	
	public List<Potion> findAll() {
		return _potionRepository.findAll();
	}
}
