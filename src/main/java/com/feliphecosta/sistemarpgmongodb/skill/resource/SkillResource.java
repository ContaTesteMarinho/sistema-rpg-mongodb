package com.feliphecosta.sistemarpgmongodb.skill.resource;

import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SkillResource {

    ResponseEntity<List<Skill>> findAll();
}
