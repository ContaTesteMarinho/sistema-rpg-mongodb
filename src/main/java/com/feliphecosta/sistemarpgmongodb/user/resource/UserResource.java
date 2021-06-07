package com.feliphecosta.sistemarpgmongodb.user.resource;

import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;
import com.feliphecosta.sistemarpgmongodb.user.domain.User;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserDTO;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserNewDTO;
import org.springframework.http.ResponseEntity;

public interface UserResource {

    ResponseEntity<User> findById(String id);

    ResponseEntity<UserDTO> findByEmail(String email);

    ResponseEntity<Void> insert(UserNewDTO userNewDTO);

    ResponseEntity<UserDTO> updateCharacterSheet(String email, CharacterSheetDTO characterSheetDTO);
}
