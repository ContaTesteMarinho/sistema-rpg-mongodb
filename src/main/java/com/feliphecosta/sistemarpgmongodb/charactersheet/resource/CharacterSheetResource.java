package com.feliphecosta.sistemarpgmongodb.charactersheet.resource;

import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;
import org.springframework.http.ResponseEntity;

public interface CharacterSheetResource {

    ResponseEntity<CharacterSheetDTO> findById(String id);

    ResponseEntity<?> create(CharacterSheetDTO characterSheetDTO);

    ResponseEntity<Void> update(CharacterSheetDTO characterSheetDTO, String id);
}
