package com.feliphecosta.sistemarpgmongodb.util;

import java.io.Serializable;

public class Attributes implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer strength;
	private Integer agility;
	private Integer intelligence;
	private Integer will;
	
	public Attributes() {}

	public Attributes(Integer strength, Integer agility, Integer intelligence, Integer will) {
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
		this.will = will;
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
	
}
