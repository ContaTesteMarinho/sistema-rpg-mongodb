package com.feliphecosta.sistemarpgmongodb.charactersheet.service.impl;

import com.feliphecosta.sistemarpgmongodb.charactersheet.domain.CharacterSheet;
import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;
import com.feliphecosta.sistemarpgmongodb.charactersheet.repository.CharacterSheetRepository;
import com.feliphecosta.sistemarpgmongodb.charactersheet.service.CharacterSheetService;
import com.feliphecosta.sistemarpgmongodb.util.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterSheetServiceImpl implements CharacterSheetService {
	
	@Autowired
	private CharacterSheetRepository _characterSheetRepository;
	
	public CharacterSheet findById(String id) {
		return _characterSheetRepository.findById(
				id
		).orElseThrow(
				() -> new ObjectNotFoundException("Character Sheet not found!")
		);
	}
	
	public CharacterSheet insert(CharacterSheet characterSheet) {
		return _characterSheetRepository.insert(characterSheet);
	}
	
	public void update(CharacterSheetDTO changedCharacterSheet, String id) {

		CharacterSheet dataBaseCharacterSheet = findById(id);

		dataBaseCharacterSheet.setAttributes(changedCharacterSheet.getAttributes());
		dataBaseCharacterSheet.setClasse(changedCharacterSheet.getClasse());
		dataBaseCharacterSheet.setCoins(changedCharacterSheet.getCoins());
		dataBaseCharacterSheet.setEquipment(changedCharacterSheet.getEquipment());
		dataBaseCharacterSheet.setHealthPoints(changedCharacterSheet.getHealthPoints());
		dataBaseCharacterSheet.setLevel(changedCharacterSheet.getLevel());
		dataBaseCharacterSheet.setManaPoints(changedCharacterSheet.getManaPoints());
		dataBaseCharacterSheet.setName(changedCharacterSheet.getName());
		dataBaseCharacterSheet.setSkills(changedCharacterSheet.getSkills());

		_characterSheetRepository.save(dataBaseCharacterSheet);
	}
	
	public CharacterSheet fromDTO(CharacterSheetDTO characterSheetDTO) {
		return new CharacterSheet(null
				, characterSheetDTO.getName()
				, characterSheetDTO.getClasse()
				, characterSheetDTO.getRace()
				, characterSheetDTO.getLevel()
				, characterSheetDTO.getCoins()
				, characterSheetDTO.getAttributes()
				, characterSheetDTO.getHealthPoints()
				, characterSheetDTO.getManaPoints()
				, characterSheetDTO.getSkills()
				, characterSheetDTO.getEquipment());
	}
}
