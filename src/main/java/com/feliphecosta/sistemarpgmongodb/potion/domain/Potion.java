package com.feliphecosta.sistemarpgmongodb.potion.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;
import com.feliphecosta.sistemarpgmongodb.potion.dto.Ingredients;

@Document
public class Potion extends Equipment {
	private static final long serialVersionUID = 1L;
	
	private Ingredients ingredientes;

	public Potion() {}

	public Potion(String nome, String aura, Integer quantidade, String raridade, String especial, Double preco, Ingredients ingredientes, String conjunto, Integer defesa) {
		super(nome, aura, quantidade, raridade, especial, preco, conjunto, defesa);
		this.ingredientes = ingredientes;
	}

	public Ingredients getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingredients ingredientes) {
		this.ingredientes = ingredientes;
	}

}