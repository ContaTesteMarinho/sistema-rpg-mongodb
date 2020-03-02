package com.feliphecosta.sistemarpgmongodb.user.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.feliphecosta.sistemarpgmongodb.user.dto.UserDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.feliphecosta.sistemarpgmongodb.charactersheet.domain.CharacterSheet;
import com.feliphecosta.sistemarpgmongodb.util.enums.Perfil;

@Document
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String email;
	private String password;
	private String characterSheet;
	private Set<Integer> perfis = new HashSet<>();
	
	public User() {
		addPerfil(Perfil.CLIENTE);
	}

	public User(String id, String email, String password, String characterSheet) {
		addPerfil(Perfil.CLIENTE);
		this.id = id;
		this.email = email;
		this.password = password;
		this.characterSheet = characterSheet;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCharacterSheet() {
		return characterSheet;
	}

	public void setCharacterSheet(String characterSheet) {
		this.characterSheet = characterSheet;
	}

	public Set<Perfil> getPerfis() {
		return perfis.stream().map(perfilInteger -> Perfil.toEnum(perfilInteger)).collect(Collectors.toSet()); 
	}

	public void addPerfil(Perfil perfil) {
		perfis.add(perfil.getCod());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
