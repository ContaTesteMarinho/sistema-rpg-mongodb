package com.feliphecosta.sistemarpgmongodb.user.services;

import com.feliphecosta.sistemarpgmongodb.user.domain.User;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserDTO;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserNewDTO;

public interface UserService {

    User findById(String id);

    User insert(User user);

    User findByEmail(String email);

    UserDTO updateCharacterSheet(String email, String characterSheetId);

    User fromDTO(UserNewDTO userNewDTO);

    UserDTO fromEntity(User user);
}
