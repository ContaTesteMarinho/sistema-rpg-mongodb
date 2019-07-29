package com.feliphecosta.sistemarpgmongodb.user.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.feliphecosta.sistemarpgmongodb.user.domain.User;
import com.feliphecosta.sistemarpgmongodb.user.dto.UserNewDTO;
import com.feliphecosta.sistemarpgmongodb.user.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<User> findById(@PathVariable String id) {
		
		User user = userService.findById(id);
		
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody UserNewDTO userNewDTO) {
		
		User newDBUser = userService.insert(userService.fromDTO(userNewDTO));
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newDBUser.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
}
