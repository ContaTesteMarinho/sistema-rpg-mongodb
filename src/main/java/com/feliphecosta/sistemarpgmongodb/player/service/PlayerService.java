package com.feliphecosta.sistemarpgmongodb.player.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.player.domain.Player;
import com.feliphecosta.sistemarpgmongodb.player.dto.PlayerDTO;
import com.feliphecosta.sistemarpgmongodb.player.repository.PlayerRepository;
import com.feliphecosta.sistemarpgmongodb.util.exceptions.ObjectNotFoundException;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepo;
	
	public Player findById(String id) {
		
		Optional<Player> optional = playerRepo.findById(id);
		
		return optional.orElseThrow(() -> new ObjectNotFoundException("Jogador não encontrado!")) ;
	}
	
	public Player insert(Player player) {
		return playerRepo.insert(player);
	}
	
	public Player update(PlayerDTO changedPlayer, String id) {
		
		findById(id);
		Player updatedPlayer = updatePlayer(changedPlayer, id);
		
		return playerRepo.save(updatedPlayer);
	}
	
	public Player updatePlayer(PlayerDTO changedPlayer, String id) {
		
		Player dataBasePlayer = playerRepo.findById(id).get();
		
		dataBasePlayer.setAttributes(changedPlayer.getAttributes());
		dataBasePlayer.setClasse(changedPlayer.getClasse());
		dataBasePlayer.setCoins(changedPlayer.getCoins());
		dataBasePlayer.setEquipment(changedPlayer.getEquipment());
		dataBasePlayer.setHealthPoints(changedPlayer.getHealthPoints());
		dataBasePlayer.setLevel(changedPlayer.getLevel());
		dataBasePlayer.setManaPoints(changedPlayer.getManaPoints());
		dataBasePlayer.setName(changedPlayer.getName());
		dataBasePlayer.setSkills(changedPlayer.getSkills());
		
		return dataBasePlayer;
	}
	
	public Player fromDTO(PlayerDTO playerDTO) {
		return new Player(null
				, playerDTO.getName()
				, playerDTO.getClasse()
				, playerDTO.getRace()
				, playerDTO.getLevel()
				, playerDTO.getCoins()
				, playerDTO.getAttributes()
				, playerDTO.getHealthPoints()
				, playerDTO.getManaPoints()
				, playerDTO.getSkills()
				, playerDTO.getEquipment());
	}
}
