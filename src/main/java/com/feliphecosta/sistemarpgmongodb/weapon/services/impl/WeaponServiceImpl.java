package com.feliphecosta.sistemarpgmongodb.weapon.services.impl;

import java.util.List;

import com.feliphecosta.sistemarpgmongodb.weapon.services.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;
import com.feliphecosta.sistemarpgmongodb.weapon.repository.WeaponRepository;

@Service
public class WeaponServiceImpl implements WeaponService {

	@Autowired
	private WeaponRepository _weaponRepository;
	
	public List<Weapon> findAll() {
		return _weaponRepository.findAll();
	}
}
