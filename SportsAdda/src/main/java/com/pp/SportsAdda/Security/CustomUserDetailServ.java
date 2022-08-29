package com.pp.SportsAdda.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pp.SportsAdda.Entity.User;
import com.pp.SportsAdda.Exceptions.ResourceNotFoundException;
import com.pp.SportsAdda.Repositry.UserRepo;

@Service
public class CustomUserDetailServ implements UserDetailsService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = this.userRepo.findByEmail(username).orElseThrow(()-> new ResourceNotFoundException("User ", " email "+username, 0));
		return user;
	}

	
}
