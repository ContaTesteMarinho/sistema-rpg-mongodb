package com.feliphecosta.sistemarpgmongodb.race.dto;

import java.io.Serializable;

import com.feliphecosta.sistemarpgmongodb.race.domain.Race;
import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;

public class RaceDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer strength;
	private Integer agility;
	private Integer intelligence;
	private Integer will;
	private String bonus;
	private String commonClasses;
	private Skill raceSkill;

	public RaceDTO() {}
	
	public RaceDTO(Race race) {
		this.name = race.getName();
		this.strength = race.getStrength();
		this.agility = race.getAgility();
		this.intelligence = race.getIntelligence();
		this.will = race.getWill();
		this.bonus = race.getBonus();
		this.commonClasses = race.getCommonClasses();
		this.raceSkill = race.getRaceSkill();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getAgility() {
		return agility;
	}

	public void setAgility(Integer agility) {
		this.agility = agility;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getWill() {
		return will;
	}

	public void setWill(Integer will) {
		this.will = will;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	public String getCommonClasses() {
		return commonClasses;
	}

	public void setCommonClasses(String commonClasses) {
		this.commonClasses = commonClasses;
	}

	public Skill getRaceSkill() {
		return raceSkill;
	}

	public void setRaceSkill(Skill raceSkill) {
		this.raceSkill = raceSkill;
	}
	
}
