package com.feliphecosta.sistemarpgmongodb.weapon.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;

@Document
public class Weapon extends Equipment {
	private static final long serialVersionUID = 1L;
	
	private Integer dano;
	private String tipo;
	private Integer fn;
	private	String grupo;
	private String observacao;	
	
	public Weapon() {}
	
	public Weapon(String nome, Integer quantidade, Double preco, Integer dano, String tipo, Integer fn, String grupo, String observacao, String conjunto) {
		super(nome, null, quantidade, null, null, preco, conjunto, null);
		this.dano = dano;
		this.tipo = tipo;
		this.fn = fn;
		this.grupo = grupo;
		this.observacao = observacao;
	}
	
	public Weapon(String nome, String aura, Integer quantidade, String raridade, String especial, Double preco, Integer dano, String tipo, Integer fn, String grupo, String observacao, String conjunto, Integer defesa) {
		super(nome, aura, quantidade, raridade, especial, preco, conjunto, defesa);
		this.dano = dano;
		this.tipo = tipo;
		this.fn = fn;
		this.grupo = grupo;
		this.observacao = observacao;
	}

	public Integer getDano() {
		return dano;
	}

	public void setDano(Integer dano) {
		this.dano = dano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getFn() {
		return fn;
	}

	public void setFn(Integer fn) {
		this.fn = fn;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
