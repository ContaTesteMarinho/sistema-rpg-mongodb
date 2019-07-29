package com.feliphecosta.sistemarpgmongodb.util.enums;

public enum Perfil {

	ADMIM(1, "ROLE_ADMIM"),
	CLIENTE(2, "ROLE_CLIENTE");
	
	private int cod;
	private String descricao;
	
	private Perfil(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static Perfil toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for (Perfil perfil : Perfil.values()) {
			if(cod.equals(perfil.getCod())) {
				return perfil;
			}
		}
		
		throw new IllegalArgumentException("Id Inválido: " + cod);
	}
}
