package com.feliphecosta.sistemarpgmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

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
		
		//Weapon w = Weapon(String nome, Integer quantidade, Double preco, Integer dano, String tipo, Integer fn, String grupo, String observacao, String conjunto);
		//Weapon w = new Weapon(nome, quantidade, preco, dano, tipo, fn, grupo, observacao, conjunto);
		
		Weapon funda = new Weapon("Estilingue/Funda", 888, 50.0, 4, DominioTipoArma.CONTUSAO.getTipo(), 1, DominioGrupo.SIMPLES.getGrupo(), null, DominioConjuntoEquipamento.DISTANCIA.getConjunto());
		Weapon zarabatan = new Weapon("Zarabatana", 888, 50.0, 4, DominioTipoArma.PERFURACAO.getTipo(), 1, DominioGrupo.SIMPLES.getGrupo(), null, DominioConjuntoEquipamento.DISTANCIA.getConjunto());
		Weapon arcoSimples = new Weapon("Arco Simples", 888, 100.0, 6, DominioTipoArma.PERFURACAO.getTipo(), 1, DominioGrupo.SIMPLES.getGrupo(), "Duas Mãos", DominioConjuntoEquipamento.DISTANCIA.getConjunto());
		Weapon arcoComposto = new Weapon("Arco Composto", 888, 150.0, 8, DominioTipoArma.PERFURACAO.getTipo(), 2, DominioGrupo.COMPLEXA.getGrupo(), "Duas Mãos", DominioConjuntoEquipamento.DISTANCIA.getConjunto());
		Weapon arcoGuerra = new Weapon("Arco de Guerra", 888, 200.0, 10, DominioTipoArma.PERFURACAO.getTipo(), 3, DominioGrupo.COMPLEXA.getGrupo(), "Duas Mãos", DominioConjuntoEquipamento.DISTANCIA.getConjunto());
		Weapon arcoElfico = new Weapon("Arco Élfico", 888, 250.0, 10, DominioTipoArma.PERFURACAO.getTipo(), 2, DominioGrupo.COMPLEXA.getGrupo(), "Duas Mãos", DominioConjuntoEquipamento.DISTANCIA.getConjunto());
		Weapon besta = new Weapon("Besta de Mão", 888, 200.0, 8, DominioTipoArma.PERFURACAO.getTipo(), 2, DominioGrupo.SIMPLES.getGrupo(), "Carregar", DominioConjuntoEquipamento.DISTANCIA.getConjunto());
		Weapon bestaPesada = new Weapon("Besta Pesada", 888, 250.0, 12, DominioTipoArma.PERFURACAO.getTipo(), 6, DominioGrupo.SIMPLES.getGrupo(), "Carregar", DominioConjuntoEquipamento.DISTANCIA.getConjunto());
		
		this.weaponRepository.saveAll(Arrays.asList(funda, zarabatan, arcoSimples, arcoComposto, arcoGuerra, arcoElfico, besta, bestaPesada));
	}

}
