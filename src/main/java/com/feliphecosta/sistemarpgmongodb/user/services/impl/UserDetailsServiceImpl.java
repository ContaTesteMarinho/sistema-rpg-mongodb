package com.feliphecosta.sistemarpgmongodb.user.services.impl;

import com.feliphecosta.sistemarpgmongodb.security.UserSS;
import com.feliphecosta.sistemarpgmongodb.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService _userService;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		return new UserSS(_userService.findByEmail(email));
	}
}
