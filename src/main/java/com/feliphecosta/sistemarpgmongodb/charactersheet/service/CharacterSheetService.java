package com.feliphecosta.sistemarpgmongodb.charactersheet.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.charactersheet.domain.CharacterSheet;
import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;
import com.feliphecosta.sistemarpgmongodb.charactersheet.repository.CharacterSheetRepository;
import com.feliphecosta.sistemarpgmongodb.util.exceptions.ObjectNotFoundException;

@Service
public class CharacterSheetService {
	
	@Autowired
	private CharacterSheetRepository characterSheetRepo;
	
	public CharacterSheet findById(String id) {
		
		Optional<CharacterSheet> optional = characterSheetRepo.findById(id);
		
		return optional.orElseThrow(() -> new ObjectNotFoundException("Ficha não encontrada!")) ;
	}
	
	public CharacterSheet insert(CharacterSheet characterSheet) {
		return characterSheetRepo.insert(characterSheet);
	}
	
	public CharacterSheet update(CharacterSheetDTO changedCharacterSheet, String id) {
		
		findById(id);
		CharacterSheet updatedCharacterSheet = updateCharacterSheet(changedCharacterSheet, id);
		
		return characterSheetRepo.save(updatedCharacterSheet);
	}
	
	public CharacterSheet updateCharacterSheet(CharacterSheetDTO changedCharacterSheet, String id) {
		
		CharacterSheet dataBaseCharacterSheet = characterSheetRepo.findById(id).get();
		
		dataBaseCharacterSheet.setAttributes(changedCharacterSheet.getAttributes());
		dataBaseCharacterSheet.setClasse(changedCharacterSheet.getClasse());
		dataBaseCharacterSheet.setCoins(changedCharacterSheet.getCoins());
		dataBaseCharacterSheet.setEquipment(changedCharacterSheet.getEquipment());
		dataBaseCharacterSheet.setHealthPoints(changedCharacterSheet.getHealthPoints());
		dataBaseCharacterSheet.setLevel(changedCharacterSheet.getLevel());
		dataBaseCharacterSheet.setManaPoints(changedCharacterSheet.getManaPoints());
		dataBaseCharacterSheet.setName(changedCharacterSheet.getName());
		dataBaseCharacterSheet.setSkills(changedCharacterSheet.getSkills());
		
		return dataBaseCharacterSheet;
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
