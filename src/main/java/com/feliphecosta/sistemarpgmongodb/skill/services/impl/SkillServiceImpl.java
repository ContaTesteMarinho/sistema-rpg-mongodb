package com.feliphecosta.sistemarpgmongodb.skill.services.impl;

import java.util.List;

import com.feliphecosta.sistemarpgmongodb.skill.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.skill.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {
	
	@Autowired
	private SkillRepository _skillRepository;
	
	public List<Skill> findAll() {
		return _skillRepository.findAll();
	}
	
	public List<Skill> findByIds(List<String> skillsIds) {
		return _skillRepository.findByIdInOrderByName(skillsIds);
	}
}
