package com.feliphecosta.sistemarpgmongodb.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.feliphecosta.sistemarpgmongodb.classe.domain.Classe;
import com.feliphecosta.sistemarpgmongodb.classe.repository.ClasseRepository;
import com.feliphecosta.sistemarpgmongodb.potion.domain.Potion;
import com.feliphecosta.sistemarpgmongodb.potion.repository.PotionRepository;
import com.feliphecosta.sistemarpgmongodb.race.domain.Race;
import com.feliphecosta.sistemarpgmongodb.race.repository.RaceRepository;
import com.feliphecosta.sistemarpgmongodb.skill.domain.Skill;
import com.feliphecosta.sistemarpgmongodb.skill.repository.SkillRepository;
import com.feliphecosta.sistemarpgmongodb.util.Attributes;
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
	
	@Autowired
	private RaceRepository raceRepo;
	
	@Autowired
	private ClasseRepository classeRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		weaponRepo.deleteAll();
		potionRepo.deleteAll();
		skillRepo.deleteAll();
		raceRepo.deleteAll();
		classeRepo.deleteAll();
		
		Weapon weapon = new Weapon("Arco de Green", "Fraca", 3, "Incomun", "Bônus de +2 nas rolagens de ataque contra criaturas voadoras (que possuem a habilidade Asas Pesadas, Asas Rápidas ou Levitação)", 350.0, 14, "Perfuração", 2, "Arma Complexa", "Duas Mãos");
		Potion potion = new Potion("Poção da Vida", "Nula", 18, "Comum", "Recupera 30 pontos de vida a quem ingerir completamente o líquido", 200.0, "Éter, Folha de oliveira e Raiz de Carvalho");
		Skill skill1 = new Skill("Graça Divina", "Com seu toque, você pode fazer uma pessoa ganhar +2 na sua próxima rolagem de dado. Esta magia só pode ser feita com um cajado", "Ação", 5, null, null, null, 10);
		Skill skill2 = new Skill("Vigor da Montanha", "Você é imune a venenos, e pode rolar 3d6 quando fizer teste para resistir à fadiga", "Suporte", null, null, null, null, null);
		
		Skill acrobacia = new Skill("Acrobacia", "Você pode rolar 3d6 quando fizer testes de agilidades para equilibrar-se, saltar com precisão e cair sem semachucar", "Suporte", null, null, null, null, null);
		Skill ataqueGiratorio = new Skill("Ataque Giratório", "Este ataque pode acertar todos os oponentes adjacentes. Faça um ataque para cada um destes oponentes", "Ação", 10, null, null, null, null);
		
		Race dwarf = new Race("Anão", 4, 2, 3, 3, null, "Guerreiro, Paladino e Sacerdote", skill2);
		Race human = new Race("Humano", 3, 3, 3, 3, "+1 em um atributo à sua escolha.", "Todas", null);
		List<Skill> skills = new ArrayList<>();
		skills.add(acrobacia);
		skills.add(ataqueGiratorio);
		Classe espadachim = new Classe("Espadachim", new Attributes(1, 1, null, null), "Usar Armas Simples e Complexas", skills, "O espadachim é o especialista em combate corporal. Suas habilidades são focadas em lutas pessoais rápidas e precisas");
		
		weaponRepo.saveAll(Arrays.asList(weapon));
		potionRepo.saveAll(Arrays.asList(potion));
		skillRepo.saveAll(Arrays.asList(skill1, skill2));
		raceRepo.saveAll(Arrays.asList(human, dwarf));
		classeRepo.saveAll(Arrays.asList(espadachim));
		
	}

}
