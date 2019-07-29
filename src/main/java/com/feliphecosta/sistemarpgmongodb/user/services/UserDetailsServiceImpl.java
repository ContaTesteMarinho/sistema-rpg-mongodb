package com.feliphecosta.sistemarpgmongodb.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.feliphecosta.sistemarpgmongodb.security.UserSS;
import com.feliphecosta.sistemarpgmongodb.user.domain.User;
import com.feliphecosta.sistemarpgmongodb.user.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		User user = userRepo.findByEmail(email);
		
		if(user == null) {
			throw new UsernameNotFoundException(email);
		}
		
		return new UserSS(user.getId(), user.getEmail(), user.getPassword(), user.getPerfis());
	}

}
