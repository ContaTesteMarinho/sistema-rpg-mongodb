package com.feliphecosta.sistemarpgmongodb.skill.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.skill.services.SkillService;

@RestController
@RequestMapping(value="/skills")
public class SkillResource {

	@Autowired
	private SkillService skillService;
	
	@GetMapping
	public ResponseEntity<List<Skill>> findAll() {
		
		List<Skill> skills = skillService.findAll();
		
		return ResponseEntity.ok().body(skills);
	}
}
