package com.feliphecosta.sistemarpgmongodb.race.dto;

import java.io.Serializable;

import com.feliphecosta.sistemarpgmongodb.race.domain.Race;
import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.util.Attributes;

public class RaceDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Attributes attributes;
	private String bonus;
	private String commonClasses;
	private Skill raceSkill;

	public RaceDTO() {}
	
	public RaceDTO(Race race) {
		this.name = race.getName();
		this.setAttributes(race.getAttributes());
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

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
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
