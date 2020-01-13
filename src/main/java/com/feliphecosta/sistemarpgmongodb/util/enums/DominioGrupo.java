package com.feliphecosta.sistemarpgmongodb.util.enums;

public enum DominioGrupo {

	SIMPLES("Arma Simples"),
	COMPLEXA("Arma Complexa"),
	DESARMADO("Desarmado");
	
	private String grupo;
	
	DominioGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getGrupo() {
		return grupo;
	}
}
