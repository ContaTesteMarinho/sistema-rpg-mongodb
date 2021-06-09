package com.feliphecosta.sistemarpgmongodb.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.feliphecosta.sistemarpgmongodb.security.JWTAuthenticationFilter;
import com.feliphecosta.sistemarpgmongodb.security.JWTAuthorizationFilter;
import com.feliphecosta.sistemarpgmongodb.security.JWTUtil;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService _userDetailsService;
	@Autowired
	private JWTUtil _jwtUtil;
	
	private static final String[] PUBLIC_MATCHERS = {
		"/character-sheets/**",
		"/users/**"
	};
	
	private static final String[] PUBLIC_MATCHERS_GET = {
		"/races",
		"/classes",
		"/weapons",
		"/skills",
		"/potions",
		"/equipments"
	};

	private static final List<String> ALLOWED_METHODS = Arrays.asList(
		HttpMethod.POST.name(),
		HttpMethod.GET.name(),
		HttpMethod.PUT.name(),
		HttpMethod.PATCH.name(),
		HttpMethod.DELETE.name(),
		HttpMethod.OPTIONS.name()
	);
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().and().csrf().disable();
		
		http.authorizeRequests()
			.antMatchers(HttpMethod.GET, PUBLIC_MATCHERS_GET).permitAll()
			.antMatchers(PUBLIC_MATCHERS).permitAll()
			.anyRequest()
			.authenticated();
		
		http.addFilter(new JWTAuthorizationFilter(authenticationManager(), _jwtUtil, _userDetailsService));
		
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(_userDetailsService).passwordEncoder(bCryptPasswordEncoder());
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/v2/api-docs"
				, "/configuration/ui"
				, "/swagger-resources/**"
				, "/configuration/**"
				, "/swagger-ui.html"
				, "/webjars/**");
	}
	
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		
		CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
		configuration.setAllowedMethods(ALLOWED_METHODS);

		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		
		return source;
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}