package com.feliphecosta.sistemarpgmongodb.potion.dto;

import com.feliphecosta.sistemarpgmongodb.equipment.dto.EquipmentDTO;
import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;

public class PotionDTO extends EquipmentDTO {
	private static final long serialVersionUID = 1L;

	private String ingredientes;

	public PotionDTO() {}
	
	public PotionDTO(Potion poison) {
		this.setAura(poison.getAura());
		this.setEspecial(poison.getEspecial());
		this.setNome(poison.getNome());
		this.setPreco(poison.getPreco());
		this.setQuantidade(poison.getQuantidade());
		this.setRaridade(poison.getRaridade());
		this.ingredientes = poison.getIngredientes();
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
		
}
