package com.lead.dell.movies.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lead.dell.movies.entities.MyUserDetails;
import com.lead.dell.movies.repository.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<com.lead.dell.movies.entities.User> user = userRepository.findByUserName(userName);

		user.orElseThrow(() -> new UsernameNotFoundException("Usuário " + userName + " não encontrado!"));

		return user.map(MyUserDetails::new).get();
	}
}