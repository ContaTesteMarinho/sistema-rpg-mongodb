package com.feliphecosta.sistemarpgmongodb.weapon.dto;

import com.feliphecosta.sistemarpgmongodb.equipment.dto.EquipmentDTO;
import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;

public class WeaponDTO extends EquipmentDTO {
	private static final long serialVersionUID = 1L;
	
	private Integer dano;
	private String tipo;
	private Integer fn;
	private	String grupo;
	private String observacao;

	public WeaponDTO() {}

	public WeaponDTO(Weapon weapon) {
		this.setNome(weapon.getNome());
		this.setAura(weapon.getAura());
		this.setRaridade(weapon.getRaridade());
		this.setQuantidade(weapon.getQuantidade());
		this.setEspecial(weapon.getEspecial());
		this.setPreco(weapon.getPreco());
		this.dano = weapon.getDano();
		this.tipo = weapon.getTipo();
		this.fn = weapon.getFn();
		this.grupo = weapon.getGrupo();
		this.observacao = weapon.getObservacao();
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
