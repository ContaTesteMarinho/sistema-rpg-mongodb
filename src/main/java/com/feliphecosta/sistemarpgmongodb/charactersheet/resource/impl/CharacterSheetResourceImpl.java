package com.feliphecosta.sistemarpgmongodb.charactersheet.resource.impl;

import com.feliphecosta.sistemarpgmongodb.charactersheet.domain.CharacterSheet;
import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;
import com.feliphecosta.sistemarpgmongodb.charactersheet.resource.CharacterSheetResource;
import com.feliphecosta.sistemarpgmongodb.charactersheet.service.CharacterSheetService;
import com.feliphecosta.sistemarpgmongodb.charactersheet.service.impl.CharacterSheetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Optional;

@RestController
@RequestMapping(value="/character-sheets")
public class CharacterSheetResourceImpl implements CharacterSheetResource {

	@Autowired
	private CharacterSheetService _characterSheetService;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<CharacterSheetDTO> findById(@PathVariable String id) {

		CharacterSheet characterSheet = _characterSheetService.findById(id);

		return ResponseEntity.ok(
            new CharacterSheetDTO(characterSheet)
		);
	}
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody CharacterSheetDTO characterSheetDTO) {

		return Optional.of(
            _characterSheetService.insert(
                _characterSheetService.fromDTO(characterSheetDTO)
            )
		).map(
            CharacterSheet::getId
		).map(
            characterSheetId -> ResponseEntity.created(
                ServletUriComponentsBuilder.fromCurrentRequest(
                ).path(
                    "/{id}"
                ).buildAndExpand(
                    characterSheetId
                ).toUri()
            ).build()
        ).orElse(
            new ResponseEntity<>(HttpStatus.BAD_REQUEST)
        );
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Void> update(@RequestBody CharacterSheetDTO characterSheetDTO, @PathVariable String id) {
		
		_characterSheetService.update(characterSheetDTO, id);
		
		return ResponseEntity.noContent().build();
	}
	
}
