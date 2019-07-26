package com.feliphecosta.sistemarpgmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;
import com.feliphecosta.sistemarpgmongodb.potion.repository.PotionRepository;
import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;
import com.feliphecosta.sistemarpgmongodb.weapon.repository.WeaponRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private WeaponRepository weaponRepo;
	
	@Autowired
	private PotionRepository potionRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		weaponRepo.deleteAll();
		potionRepo.deleteAll();
		
		Weapon weapon = new Weapon("Arco de Green", "Fraca", 3, "Incomun", "Bônus de +2 nas rolagens de ataque contra criaturas voadoras (que possuem a habilidade Asas Pesadas, Asas Rápidas ou Levitação)", 350.0, 14, "Perfuração", 2, "Arma Complexa", "Duas Mãos");
		Potion potion = new Potion("Poção da Vida", "Nula", 18, "Comum", "Recupera 30 pontos de vida a quem ingerir completamente o líquido", 200.0, "Éter, Folha de oliveira e Raiz de Carvalho");
		
		weaponRepo.saveAll(Arrays.asList(weapon));
		potionRepo.saveAll(Arrays.asList(potion));
	}

}
