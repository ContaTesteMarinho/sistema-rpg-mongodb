package com.feliphecosta.sistemarpgmongodb.user.resource.impl;

import java.net.URI;

import com.feliphecosta.sistemarpgmongodb.charactersheet.domain.CharacterSheet;
import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;
import com.feliphecosta.sistemarpgmongodb.charactersheet.service.CharacterSheetService;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserDTO;
import com.feliphecosta.sistemarpgmongodb.user.resource.UserResource;
import com.feliphecosta.sistemarpgmongodb.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.feliphecosta.sistemarpgmongodb.user.domain.User;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserNewDTO;

@RestController
@RequestMapping(value="/users")
public class UserResourceImpl implements UserResource {

	@Autowired
	private UserService _userService;
	@Autowired
	private CharacterSheetService _characterSheetService;

	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable String id) {
		
		User user = _userService.findById(id);
		
		return ResponseEntity.ok().body(user);
	}

	//TODO: change to {email}/email and encrypt this email before to send in path
	@GetMapping("/email")
	public ResponseEntity<UserDTO> findByEmail(@RequestParam(value="value") String email) {
		User user = _userService.findByEmail(email);
		UserDTO userDTO = _userService.fromEntity(user);

		return ResponseEntity.ok().body(userDTO);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody UserNewDTO userNewDTO) {
		
		User newDBUser = _userService.insert(_userService.fromDTO(userNewDTO));
		
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}").buildAndExpand(newDBUser.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}

	@PatchMapping
	public ResponseEntity<UserDTO> updateCharacterSheet(
			  @RequestParam(value="email") String email
			, @RequestBody CharacterSheetDTO characterSheetDTO) {

		CharacterSheet characterSheet = _characterSheetService.insert(_characterSheetService.fromDTO(characterSheetDTO));

		UserDTO userDTO = _userService.updateCharacterSheet(email, characterSheet.getId());

		return new ResponseEntity<>(userDTO, HttpStatus.OK);
	}

}
