package com.feliphecosta.sistemarpgmongodb.skill.dto;

import java.io.Serializable;

import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;

public class SkillDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String name;
	private String description;
	private String feature;
	private Integer mana;
	private String requirements;
	private String especial;
	private String example;
	private Integer magicDifficulty;
	
	public SkillDTO() {}

	public SkillDTO(Skill skill) {
		this.name = skill.getName();
		this.description = skill.getDescription();
		this.feature = skill.getFeature();
		this.mana = skill.getMana();
		this.requirements = skill.getRequirements();
		this.especial = skill.getEspecial();
		this.example = skill.getExample();
		this.magicDifficulty = skill.getMagicDifficulty();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getEspecial() {
		return especial;
	}

	public void setEspecial(String especial) {
		this.especial = especial;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public Integer getMagicDifficulty() {
		return magicDifficulty;
	}

	public void setMagicDifficulty(Integer magicDifficulty) {
		this.magicDifficulty = magicDifficulty;
	}
	
	
}
