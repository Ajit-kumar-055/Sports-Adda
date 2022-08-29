package com.pp.SportsAdda;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.pp.SportsAdda.Entity.Role;
import com.pp.SportsAdda.Exceptions.ResourceNotFoundException;
import com.pp.SportsAdda.Repositry.RoleRepo;

@SpringBootApplication
public class SportsAddaApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepo roleRepo;

	public static void main(String[] args) {
		SpringApplication.run(SportsAddaApplication.class, args);
		
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(this.passwordEncoder.encode("55vh"));
		
		try {
			Role roleAd = new Role();
			roleAd.setId(501);
			roleAd.setName("Admin");
			Role roleNor = new Role();
			roleNor.setId(502);
			roleNor.setName("Normal_User");
			
			List<Role> roles = List.of(roleNor,roleAd);
			List<Role> result = this.roleRepo.saveAll(roles);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
