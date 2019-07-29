package com.feliphecosta.sistemarpgmongodb.charactersheet.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.feliphecosta.sistemarpgmongodb.charactersheet.domain.CharacterSheet;
import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;
import com.feliphecosta.sistemarpgmongodb.charactersheet.service.CharacterSheetService;

@RestController
@RequestMapping(value="/charactersheets")
public class CharacterSheetResource {

	@Autowired
	private CharacterSheetService characterSheetService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<CharacterSheetDTO> findById(@PathVariable String id) {
		
		CharacterSheet dataBaseCharactersheets = characterSheetService.findById(id);
		
		return ResponseEntity.ok().body(new CharacterSheetDTO(dataBaseCharactersheets));
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody CharacterSheetDTO characterSheetDTO) {
		
		CharacterSheet newDataBaseCharactersheets = characterSheetService.insert(characterSheetService.fromDTO(characterSheetDTO));
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newDataBaseCharactersheets.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody CharacterSheetDTO characterSheetDTO,@PathVariable String id) {
		
		characterSheetService.update(characterSheetDTO, id);
		
		return ResponseEntity.noContent().build();
	}
	
}
