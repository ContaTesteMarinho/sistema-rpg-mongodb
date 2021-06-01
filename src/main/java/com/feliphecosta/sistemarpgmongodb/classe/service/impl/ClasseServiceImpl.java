package com.feliphecosta.sistemarpgmongodb.classe.service.impl;

import com.feliphecosta.sistemarpgmongodb.classe.dto.ClasseDTO;
import com.feliphecosta.sistemarpgmongodb.classe.repository.ClasseRepository;
import com.feliphecosta.sistemarpgmongodb.classe.service.ClasseService;
import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.skill.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClasseServiceImpl implements ClasseService {

	@Autowired
	private ClasseRepository _classeRepository;
	@Autowired
	private SkillService _skillService;
	
	public List<ClasseDTO> findAll() {
		return _classeRepository.findAll().stream(
		).map(
			classe -> {
				List<Skill> skills = _skillService.findByIds(classe.getSkills());
				return new ClasseDTO(classe, skills);
			}
		).collect(
			Collectors.toList()
		);
	}
}
