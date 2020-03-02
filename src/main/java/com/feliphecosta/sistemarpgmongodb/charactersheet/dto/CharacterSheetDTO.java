package com.feliphecosta.sistemarpgmongodb.charactersheet.dto;

import java.io.Serializable;
import java.util.List;

import com.feliphecosta.sistemarpgmongodb.charactersheet.domain.CharacterSheet;
import com.feliphecosta.sistemarpgmongodb.classe.domain.Classe;
import com.feliphecosta.sistemarpgmongodb.race.domain.Race;
import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.util.Attributes;
import com.feliphecosta.sistemarpgmongodb.util.Equipamentos;
import com.feliphecosta.sistemarpgmongodb.util.Level;

public class CharacterSheetDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private Classe classe;
	private Race race;
	private Level level;
	private Integer coins;
	private Attributes attributes;
	private Integer healthPoints;
	private Integer manaPoints;
	private List<Skill> skills;
	private Equipamentos equipment;
	private Integer defense;
	
	public CharacterSheetDTO() {}

	public CharacterSheetDTO(CharacterSheet characterSheet) {
		this.name = characterSheet.getName();
		this.classe = characterSheet.getClasse();
		this.race = characterSheet.getRace();
		this.level = characterSheet.getLevel();
		this.coins = characterSheet.getCoins();
		this.attributes = characterSheet.getAttributes();
		this.healthPoints = characterSheet.getHealthPoints();
		this.manaPoints = characterSheet.getManaPoints();
		this.skills = characterSheet.getSkills();
		this.equipment = characterSheet.getEquipment();
		this.defense = characterSheet.getDefense();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Integer getCoins() {
		return coins;
	}

	public void setCoins(Integer coins) {
		this.coins = coins;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public Integer getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(Integer healthPoints) {
		this.healthPoints = healthPoints;
	}

	public Integer getManaPoints() {
		return manaPoints;
	}

	public void setManaPoints(Integer manaPoints) {
		this.manaPoints = manaPoints;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public Equipamentos getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipamentos equipment) {
		this.equipment = equipment;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	
}
