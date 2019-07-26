package com.feliphecosta.sistemarpgmongodb.potion.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;

@Document
public class Potion extends Equipment {
	private static final long serialVersionUID = 1L;
	
	private String ingredientes;

	public Potion() {}

	public Potion(String nome, String aura, Integer quantidade, String raridade, String especial, Double preco, String ingredientes) {
		super(nome, aura, quantidade, raridade, especial, preco);
		this.ingredientes = ingredientes;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

}