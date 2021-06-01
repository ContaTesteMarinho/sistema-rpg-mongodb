package com.feliphecosta.sistemarpgmongodb.classe.resource.impl;

import java.util.List;

import com.feliphecosta.sistemarpgmongodb.classe.resource.ClasseResource;
import com.feliphecosta.sistemarpgmongodb.classe.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feliphecosta.sistemarpgmongodb.classe.dto.ClasseDTO;

@RestController
@RequestMapping(value="/classes")
public class ClasseResourceImpl implements ClasseResource {

	@Autowired
	private ClasseService _classeService;
	
	@GetMapping
	public ResponseEntity<List<ClasseDTO>> findAll() {
		return ResponseEntity.ok().body(
				_classeService.findAll()
		);
	}
}
