package com.feliphecosta.sistemarpgmongodb.weapon.resource;

import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface WeaponResource {

    ResponseEntity<List<Weapon>> findAll();
}
