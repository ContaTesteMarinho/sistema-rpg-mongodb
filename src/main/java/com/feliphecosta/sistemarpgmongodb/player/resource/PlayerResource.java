package com.feliphecosta.sistemarpgmongodb.player.resource;

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

import com.feliphecosta.sistemarpgmongodb.player.domain.Player;
import com.feliphecosta.sistemarpgmongodb.player.dto.PlayerDTO;
import com.feliphecosta.sistemarpgmongodb.player.service.PlayerService;

@RestController
@RequestMapping(value="/players")
public class PlayerResource {

	@Autowired
	private PlayerService playerService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<PlayerDTO> findById(@PathVariable String id) {
		
		Player dataBasePlayer = playerService.findById(id);
		
		return ResponseEntity.ok().body(new PlayerDTO(dataBasePlayer));
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody PlayerDTO playerDTO) {
		
		Player newDataBasePlayer = playerService.insert(playerService.fromDTO(playerDTO));
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newDataBasePlayer.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody PlayerDTO playerDTO,@PathVariable String id) {
		
		playerService.update(playerDTO, id);
		
		return ResponseEntity.noContent().build();
	}
	
}
