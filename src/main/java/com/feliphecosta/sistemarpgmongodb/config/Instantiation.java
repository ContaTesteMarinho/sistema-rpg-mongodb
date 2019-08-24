package com.feliphecosta.sistemarpgmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.feliphecosta.sistemarpgmongodb.user.domain.User;
import com.feliphecosta.sistemarpgmongodb.user.repository.UserRepository;
import com.feliphecosta.sistemarpgmongodb.util.enums.Perfil;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder pe;
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
	}

}
