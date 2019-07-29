package com.feliphecosta.sistemarpgmongodb.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {

	@Value("${jwt.secret}")
	private String jwtSecret;
	
	@Value("${jwt.expiration}")
	private Long expiration;
	
	public String generateToken(String userName) {
		
		return Jwts.builder()
				.setSubject(userName)
				.setExpiration(new Date(System.currentTimeMillis() + expiration))
				.signWith(SignatureAlgorithm.HS512, jwtSecret.getBytes())
				.compact();
					
	}
}
