package com.feliphecosta.sistemarpgmongodb.util.enums;

public enum DominioTipoArma {

	CONTUSAO("Contusão"),
	PERFURACAO("Perfuração"),
	CORTE("Corte"),
	CORTE_PERFURACAO("Corte ou Perfuração");
	
	private String tipo;
	
	DominioTipoArma(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
