package com.feliphecosta.sistemarpgmongodb.user.dto;

import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;
import com.feliphecosta.sistemarpgmongodb.user.domain.User;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String email;
    private CharacterSheetDTO characterSheet;

    public UserDTO() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CharacterSheetDTO getCharacterSheet() {
        return characterSheet;
    }

    public void setCharacterSheet(CharacterSheetDTO characterSheet) {
        this.characterSheet = characterSheet;
    }
}
