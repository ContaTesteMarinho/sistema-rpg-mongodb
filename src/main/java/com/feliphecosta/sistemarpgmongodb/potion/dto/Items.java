package com.feliphecosta.sistemarpgmongodb.potion.dto;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;

public class Items extends Equipment {
	private static final long serialVersionUID = 1L;

	public Items() {
		super();
	}

	public Items(String nome, String aura, Integer quantidade, String raridade, String especial, Double preco,
			String subGrupo, Integer defesa) {
		super(nome, aura, quantidade, raridade, especial, preco, subGrupo, defesa, null);
	}
	
}
