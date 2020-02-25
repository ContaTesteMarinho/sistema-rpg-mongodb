package com.feliphecosta.sistemarpgmongodb.skill.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;

@Repository
public interface SkillRepository extends MongoRepository<Skill, String> {

	public List<Skill> findByIdIn(List<String> ids);
}
