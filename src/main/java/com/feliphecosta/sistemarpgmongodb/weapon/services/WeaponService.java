package com.feliphecosta.sistemarpgmongodb.weapon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;
import com.feliphecosta.sistemarpgmongodb.weapon.repository.WeaponRepository;

@Service
public class WeaponService {

	@Autowired
	private WeaponRepository weaponRepo;
	
	public List<Weapon> findAll() {
		return weaponRepo.findAll();
	}
}
