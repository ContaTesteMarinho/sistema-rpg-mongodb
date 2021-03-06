package com.feliphecosta.sistemarpgmongodb.equipment.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="equipment")
public class Equipment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome;
	private String aura;
	private String raridade;
	private Integer quantidade;
	private String especial;
	private Double preco;
	private String conjunto;
	private Integer defesa;
	private String descricao;
	
	public Equipment() {}

	public Equipment(String nome, String aura, Integer quantidade, String raridade, String especial, Double preco, String conjunto, Integer defesa, String descricao) {
		super();
		this.id = null;
		this.nome = nome;
		this.aura = aura;
		this.quantidade = quantidade;
		this.raridade = raridade;
		this.especial = especial;
		this.preco = preco;
		this.conjunto = conjunto;
		this.defesa = defesa;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAura() {
		return aura;
	}

	public void setAura(String aura) {
		this.aura = aura;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getRaridade() {
		return raridade;
	}

	public void setRaridade(String raridade) {
		this.raridade = raridade;
	}

	public String getEspecial() {
		return especial;
	}

	public void setEspecial(String especial) {
		this.especial = especial;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getConjunto() {
		return conjunto;
	}

	public void setConjunto(String conjunto) {
		this.conjunto = conjunto;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}