package com.feliphecosta.sistemarpgmongodb.charactersheet.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.feliphecosta.sistemarpgmongodb.classe.domain.Classe;
import com.feliphecosta.sistemarpgmongodb.race.domain.Race;
import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.util.Attributes;
import com.feliphecosta.sistemarpgmongodb.util.Equipamentos;
import com.feliphecosta.sistemarpgmongodb.util.Level;

@Document
public class CharacterSheet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
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
	
	public CharacterSheet() {}

	public CharacterSheet(String id, String name, Classe classe,Race race , Level level, Integer coins, Attributes attributes,
			Integer healthPoints, Integer manaPoints, List<Skill> skills, Equipamentos equipment) {
		this.id = id;
		this.name = name;
		this.classe = classe;
		this.setRace(race);
		this.level = level;
		this.coins = coins;
		this.attributes = attributes;
		this.healthPoints = healthPoints;
		this.manaPoints = manaPoints;
		this.skills = skills;
		this.equipment = equipment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharacterSheet other = (CharacterSheet) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
