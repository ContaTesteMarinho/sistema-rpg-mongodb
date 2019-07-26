package com.feliphecosta.sistemarpgmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;
import com.feliphecosta.sistemarpgmongodb.potion.repository.PotionRepository;
import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.skill.repository.SkillRepository;
import com.feliphecosta.sistemarpgmongodb.weapon.domain.Weapon;
import com.feliphecosta.sistemarpgmongodb.weapon.repository.WeaponRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private WeaponRepository weaponRepo;
	
	@Autowired
	private PotionRepository potionRepo;
	
	@Autowired
	private SkillRepository skillRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		weaponRepo.deleteAll();
		potionRepo.deleteAll();
		
		Weapon weapon = new Weapon("Arco de Green", "Fraca", 3, "Incomun", "Bônus de +2 nas rolagens de ataque contra criaturas voadoras (que possuem a habilidade Asas Pesadas, Asas Rápidas ou Levitação)", 350.0, 14, "Perfuração", 2, "Arma Complexa", "Duas Mãos");
		Potion potion = new Potion("Poção da Vida", "Nula", 18, "Comum", "Recupera 30 pontos de vida a quem ingerir completamente o líquido", 200.0, "Éter, Folha de oliveira e Raiz de Carvalho");
		Skill skill = new Skill("Graça Divina", "Com seu toque, você pode fazer uma pessoa ganhar +2 na sua próxima rolagem de dado. Esta magia só pode ser feita com um cajado", "Ação", 5, null, null, null, 10);
		
		weaponRepo.saveAll(Arrays.asList(weapon));
		potionRepo.saveAll(Arrays.asList(potion));
		skillRepo.saveAll(Arrays.asList(skill));
	}

}
