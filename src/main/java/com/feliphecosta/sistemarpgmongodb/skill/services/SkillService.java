package com.feliphecosta.sistemarpgmongodb.skill.services;

import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;

import java.util.List;

public interface SkillService {

    List<Skill> findAll();

    List<Skill> findByIds(List<String> skillsIds);
}
