package com.feliphecosta.sistemarpgmongodb.util.enums;

public enum DominioConjuntoEquipamento {

	DISTANCIA("Armas de Distância"),
	CORPORAIS("Armas Corporais"),
	PROTECAO("Equipamentos de Proteção"),
	OUTROS("Outros Itens"),
	CONJURADORES("Itens para Conjuradores");
	
	private String conjunto;
	
	DominioConjuntoEquipamento(String conjunto) {
		this.conjunto = conjunto;
	}

	public String getConjunto() {
		return conjunto;
	}
}
