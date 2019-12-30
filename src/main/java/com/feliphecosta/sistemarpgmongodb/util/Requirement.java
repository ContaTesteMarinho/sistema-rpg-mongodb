package com.feliphecosta.sistemarpgmongodb.util;

import java.io.Serializable;
import java.util.List;

import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;

public class Requirement implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer level;
	private List<Skill> skills;
	private String type;
	
	public Requirement() {}
	
	public Requirement(Integer level, List<Skill> skills, String type) {
		this.level = level;
		this.skills = skills;
		this.type = type;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
