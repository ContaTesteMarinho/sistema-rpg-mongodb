package com.feliphecosta.sistemarpgmongodb.classe.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feliphecosta.sistemarpgmongodb.classe.dto.ClasseDTO;
import com.feliphecosta.sistemarpgmongodb.classe.service.ClasseService;

@RestController
@RequestMapping(value="/classes")
public class ClasseResource {

	@Autowired
	private ClasseService classeService;
	
	@GetMapping
	public ResponseEntity<List<ClasseDTO>> findAll(){
		
		List<ClasseDTO> classesDTO = classeService.findAll();
		
		return ResponseEntity.ok().body(classesDTO);
	}
}
