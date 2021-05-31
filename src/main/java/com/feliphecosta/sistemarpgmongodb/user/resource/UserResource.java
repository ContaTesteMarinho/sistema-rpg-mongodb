package com.feliphecosta.sistemarpgmongodb.user.resource;

import java.net.URI;

import com.feliphecosta.sistemarpgmongodb.charactersheet.domain.CharacterSheet;
import com.feliphecosta.sistemarpgmongodb.charactersheet.dto.CharacterSheetDTO;
import com.feliphecosta.sistemarpgmongodb.charactersheet.service.impl.CharacterSheetServiceImpl;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.feliphecosta.sistemarpgmongodb.user.domain.User;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserNewDTO;
import com.feliphecosta.sistemarpgmongodb.user.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService userService;
	@Autowired
	private CharacterSheetServiceImpl characterSheetServiceImpl;
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable String id) {
		
		User user = userService.findById(id);
		
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping("/email")
	public ResponseEntity<UserDTO> find(@RequestParam(value="value") String email) {
		User user = userService.findByEmail(email);
		UserDTO userDTO = userService.fromEntity(user);

		return ResponseEntity.ok().body(userDTO);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody UserNewDTO userNewDTO) {
		
		User newDBUser = userService.insert(userService.fromDTO(userNewDTO));
		
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}").buildAndExpand(newDBUser.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}

	@PatchMapping
	public ResponseEntity<UserDTO> updateCharacterSheet(
			  @RequestParam(value="email") String email
			, @RequestBody CharacterSheetDTO characterSheetDTO) {

		CharacterSheet newDataBaseCharactersheets = characterSheetServiceImpl
				.insert(characterSheetServiceImpl.fromDTO(characterSheetDTO));

		UserDTO userDTO = userService.updateCharacterSheet(email, newDataBaseCharactersheets.getId());

		return new ResponseEntity<>(userDTO, HttpStatus.OK);
	}

}
