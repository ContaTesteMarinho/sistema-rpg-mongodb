package com.feliphecosta.sistemarpgmongodb.classe.dto;

import java.io.Serializable;
import java.util.List;

import com.feliphecosta.sistemarpgmongodb.classe.domain.Classe;
import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.util.Attributes;

public class ClasseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Attributes attributes;
	private String proficiency;
	private List<Skill> skills;
	private String description;
	
	public ClasseDTO() {}

	public ClasseDTO(Classe classe, List<Skill> skills) {
		this.name = classe.getName();
		this.attributes = classe.getAttributes();
		this.proficiency = classe.getProficiency();
		this.description = classe.getDescription();
		this.skills = skills;
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

	public String getProficiency() {
		return proficiency;
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
