package com.pp.SportsAdda.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pp.SportsAdda.Entity.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {
	
}
