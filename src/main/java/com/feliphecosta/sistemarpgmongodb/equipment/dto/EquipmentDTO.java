package com.feliphecosta.sistemarpgmongodb.equipment.dto;

import java.io.Serializable;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;

public class EquipmentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String aura;
	private String raridade;
	private Integer quantidade;
	private String especial;
	private Double preco;
	
	public EquipmentDTO() {}
	
	public EquipmentDTO(Equipment equip) {
		this.nome = equip.getNome();
		this.aura = equip.getAura();
		this.raridade = equip.getRaridade();
		this.quantidade = equip.getQuantidade();
		this.especial = equip.getEspecial();
		this.preco = equip.getPreco();
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
	public String getRaridade() {
		return raridade;
	}
	public void setRaridade(String raridade) {
		this.raridade = raridade;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
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
	
}
