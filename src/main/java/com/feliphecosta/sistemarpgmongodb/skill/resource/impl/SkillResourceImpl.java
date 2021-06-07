package com.feliphecosta.sistemarpgmongodb.skill.resource.impl;

import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.skill.resource.SkillResource;
import com.feliphecosta.sistemarpgmongodb.skill.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/skills")
public class SkillResourceImpl implements SkillResource {

	@Autowired
	private SkillService _skillService;
	
	@GetMapping
	public ResponseEntity<List<Skill>> findAll() {
		return ResponseEntity.ok().body(
				_skillService.findAll()
		);
	}
}
