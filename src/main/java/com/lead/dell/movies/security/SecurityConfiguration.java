package com.lead.dell.movies.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	UserDetailsService userDetailsService;
	
	@Override
	protected void configure (AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(userDetailsService);
		
	}
	
	@Override
	protected void configure (HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
						.antMatchers("/listall-user","list-user/{userId}",
									 "/add-user").hasRole("ADM")
						.antMatchers("/","/listall-movie",
									 "/list-movie/{movieId}",
									 "/listall-genre",
									 "/list-genre/{genreId}").permitAll()
						.anyRequest().authenticated()
						.and().formLogin().permitAll();
		
		
//		http.authorizeRequests()
//				.antMatchers("/listall-movie").hasAnyRole("VISITOR", "ADM")
//				.antMatchers("/add-user").hasAnyRole("VISITOR", "ADM")
//				.antMatchers("/edit-user").hasRole("ADM")
//				.antMatchers("/").permitAll()
//				.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
}