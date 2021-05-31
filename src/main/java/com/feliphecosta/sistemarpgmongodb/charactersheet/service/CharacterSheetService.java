package com.feliphecosta.sistemarpgmongodb.charactersheet.service;

import com.feliphecosta.sistemarpgmongodb.charactersheet.domain.CharacterSheet;
import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;

public interface CharacterSheetService {

    CharacterSheet findById(String id);

    CharacterSheet insert(CharacterSheet characterSheet);

    void update(CharacterSheetDTO changedCharacterSheet, String id);

    CharacterSheet fromDTO(CharacterSheetDTO characterSheetDTO);

}
