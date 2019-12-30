package com.feliphecosta.sistemarpgmongodb.skill.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.feliphecosta.sistemarpgmongodb.util.Requirement;

@Document
public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;
	private String description;
	private String feature;
	private Integer mana;
	private Requirement requirements;
	private String especial;
	private String example;
	private Integer magicDifficulty;
	private Boolean advanced;
	
	public Skill() {}

	public Skill(String name, String description, String feature, Integer mana, Requirement requirements, String especial,
			String example, Integer magicDifficulty, boolean advanced) {
		this.setId(null);
		this.name = name;
		this.description = description;
		this.feature = feature;
		this.mana = mana;
		this.requirements = requirements;
		this.especial = especial;
		this.example = example;
		this.magicDifficulty = magicDifficulty;
		this.advanced = advanced;
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

	public Requirement getRequirements() {
		return requirements;
	}

	public void setRequirements(Requirement requirements) {
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

	public Boolean getAdvanced() {
		return advanced;
	}

	public void setAdvanced(Boolean advanced) {
		this.advanced = advanced;
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
		Skill other = (Skill) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
