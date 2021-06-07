package com.feliphecosta.sistemarpgmongodb.user.services.impl;

import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;
import com.feliphecosta.sistemarpgmongodb.charactersheet.service.impl.CharacterSheetServiceImpl;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserDTO;
import com.feliphecosta.sistemarpgmongodb.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.user.domain.User;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserNewDTO;
import com.feliphecosta.sistemarpgmongodb.user.repository.UserRepository;
import com.feliphecosta.sistemarpgmongodb.util.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository _userRepository;
	@Autowired
	private BCryptPasswordEncoder _passwordEncoder;
	@Autowired
	private CharacterSheetServiceImpl _characterSheetServiceImpl;
	
	public User findById(String id) {
        return _userRepository.findById(
            id
        ).orElseThrow(
            () -> new ObjectNotFoundException("User not found!")
        );
	}
	
	public User insert(User user) {
		return _userRepository.insert(user);
	}

	public User findByEmail(String email) {
		return Optional.ofNullable(
				_userRepository.findByEmail(email)
		).orElseThrow(
				() -> new UsernameNotFoundException(email)
		);
	}

	public UserDTO updateCharacterSheet(String email, String characterSheetId) {

		User user = findByEmail(email);
		user.setCharacterSheet(characterSheetId);

		return fromEntity(_userRepository.save(user));
	}

	public User fromDTO(UserNewDTO userNewDTO) {
		return new User(userNewDTO.getEmail(), _passwordEncoder.encode(userNewDTO.getPassword()));
	}

	public UserDTO fromEntity(User user) {
		UserDTO userDTO = new UserDTO();

		userDTO.setEmail(user.getEmail());

		if (user.getCharacterSheet() != null) {
			userDTO.setCharacterSheet(
                new CharacterSheetDTO(
                    _characterSheetServiceImpl.findById(user.getCharacterSheet())
                )
            );
		}

		return userDTO;
	}
	
}
