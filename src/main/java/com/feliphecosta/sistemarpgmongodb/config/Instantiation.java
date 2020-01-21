package com.feliphecosta.sistemarpgmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;
import com.feliphecosta.sistemarpgmongodb.equipment.repository.EquipmentRepository;
import com.feliphecosta.sistemarpgmongodb.potion.repository.PotionRepository;
import com.feliphecosta.sistemarpgmongodb.util.enums.DominioConjuntoEquipamento;
import com.feliphecosta.sistemarpgmongodb.util.enums.DominioGrupo;
import com.feliphecosta.sistemarpgmongodb.util.enums.DominioTipoArma;
import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;
import com.feliphecosta.sistemarpgmongodb.weapon.repository.WeaponRepository;

@Configuration
public class Instantiation implements CommandLineRunner {	
	
	@Autowired
	private WeaponRepository weaponRepository;
	
	@Autowired
	private EquipmentRepository equipmentRepository;
	
	@Autowired
	private PotionRepository potionRepository;
	
	@Override
	public void run(String... args) throws Exception {
		//Weapon w = new Weapon(nome, aura, quantidade, raridade, especial, preco, dano, tipo, fn, grupo, observacao, conjunto, defesa);
	}

}
