package com.feliphecosta.sistemarpgmongodb.skill.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.skill.repository.SkillRepository;

@Service
public class SkillService {
	
	@Autowired
	private SkillRepository skillRepo;
	
	public List<Skill> findAll() {
		return skillRepo.findAll();
	}
	
	public List<Skill> findByIds(List<String> skillsIds) {
		return skillRepo.findByIdInOrderByName(skillsIds);
	}
}
