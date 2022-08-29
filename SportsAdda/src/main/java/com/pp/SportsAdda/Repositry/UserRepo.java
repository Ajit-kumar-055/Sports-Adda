package com.pp.SportsAdda.Repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pp.SportsAdda.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	Optional<User> findByEmail(String email);

}
