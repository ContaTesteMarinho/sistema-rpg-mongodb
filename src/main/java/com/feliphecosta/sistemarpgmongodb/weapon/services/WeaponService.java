package com.feliphecosta.sistemarpgmongodb.weapon.services;

import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;

import java.util.List;

public interface WeaponService {

    List<Weapon> findAll();
}
