package com.feliphecosta.sistemarpgmongodb.potion.dto;

import java.io.Serializable;
import java.util.List;

public class Ingredients implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Items> items;
	
	public Ingredients() {}
	
	public Ingredients(List<Items> items) {
		this.items = items;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}
		
}
