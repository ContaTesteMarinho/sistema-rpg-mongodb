package com.feliphecosta.sistemarpgmongodb.classe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.classe.dto.ClasseDTO;
import com.feliphecosta.sistemarpgmongodb.classe.repository.ClasseRepository;
import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.skill.services.SkillService;

@Service
public class ClasseService {

	@Autowired
	private ClasseRepository classeRepo;
	
	@Autowired
	private SkillService skillService;
	
	public List<ClasseDTO> findAll() { 
		
		List<ClasseDTO> classesDTO = new ArrayList<>();
		
		classeRepo.findAll().forEach(classe -> {
			List<Skill> skills = skillService.findByIds(classe.getSkills());
			classesDTO.add(new ClasseDTO(classe, skills));
		});
		
		return classesDTO;
	}
}
