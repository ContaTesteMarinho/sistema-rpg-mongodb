package com.feliphecosta.sistemarpgmongodb.util;

import java.io.Serializable;
import java.util.List;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;
import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;
import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;

public class Equipamentos implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<Weapon> weapons;
	private List<Equipment> equipamentos;
	private List<Potion> potions;
	
	public Equipamentos() {}

	public Equipamentos(List<Weapon> weapons, List<Equipment> equipamentos, List<Potion> potions) {
		this.weapons = weapons;
		this.equipamentos = equipamentos;
		this.potions = potions;
	}

	public List<Weapon> getWeapons() {		
		return weapons;		
	}

	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	public List<Equipment> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipment> equipamentos) {
		this.equipamentos = equipamentos;
	}

	public List<Potion> getPotions() {
		return potions;
	}

	public void setPotions(List<Potion> potions) {
		this.potions = potions;
	}
	
	
}
