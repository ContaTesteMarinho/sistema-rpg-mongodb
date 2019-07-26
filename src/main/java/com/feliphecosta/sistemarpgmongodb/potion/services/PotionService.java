package com.feliphecosta.sistemarpgmongodb.potion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;
import com.feliphecosta.sistemarpgmongodb.potion.repository.PotionRepository;

@Service
public class PotionService {

	@Autowired
	private PotionRepository potionRepo;
	
	public List<Potion> findAll() {
		return potionRepo.findAll();
	}
}
