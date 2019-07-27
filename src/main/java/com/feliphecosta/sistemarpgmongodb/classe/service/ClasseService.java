package com.feliphecosta.sistemarpgmongodb.classe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.classe.domain.Classe;
import com.feliphecosta.sistemarpgmongodb.classe.repository.ClasseRepository;

@Service
public class ClasseService {

	@Autowired
	private ClasseRepository classeRepo;
	
	public List<Classe> findAll() { 
		
		List<Classe> classes = classeRepo.findAll();
		
		return classes;
	}
}
