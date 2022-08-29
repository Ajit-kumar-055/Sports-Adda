package com.pp.SportsAdda.Services.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.pp.SportsAdda.Entity.Role;
import com.pp.SportsAdda.Entity.User;
import com.pp.SportsAdda.Exceptions.ResourceNotFoundException;
import com.pp.SportsAdda.Repositry.RoleRepo;
import com.pp.SportsAdda.Repositry.UserRepo;
import com.pp.SportsAdda.Services.UserServ;
import com.pp.SportsAdda.payloads.UserDto;

@Service
public class UserServImpl implements UserServ {
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepo roleRepo;

	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = dtoToUser(userDto);
		User savedUser = this.userRepo.save(user);
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer id) {
		// TODO Auto-generated method stub
		User user = this.userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", " id ", id));
		user.setEmail(userDto.getEmail());
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		User updatedUser = this.userRepo.save(user);
		
		return this.userToDto(updatedUser);
	}

	@Override
	public UserDto getUser(Integer id) {
		// TODO Auto-generated method stub
		User user = this.userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", " id ", id));
		return this.userToDto(user);
	}

	@Override
	public void deleteUser(UserDto userDto, Integer id) {
		// TODO Auto-generated method stub
		
		User user = this.userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User", " id ", id));
		this.userRepo.delete(user);
	}
	
	private User dtoToUser(UserDto userDto) {
		User user = this.modelMapper.map(userDto, User.class);
//		user.setId(userDto.getId());
//		user.setName(userDto.getName());
//		user.setEmail(userDto.getEmail());
//		user.setPassword(userDto.getPassword());
//		user.setUserName(userDto.getUserName());
		return user;
	}
	
	private UserDto userToDto(User user) {
		UserDto userDto = this.modelMapper.map(user, UserDto.class);
//		userDto.setId(user.getId());
//		userDto.setName(user.getName());
//		userDto.setEmail(user.getEmail());
//		userDto.setPassword(user.getPassword());
//		userDto.setUserName(user.getUserName());
		return userDto;
	}

	@Override
	public UserDto registerNewUser(UserDto userDto) {
		User user = this.modelMapper.map(userDto, User.class);
		user.setPassword(this.passwordEncoder.encode(user.getPassword()));
		Role role = this.roleRepo.findById(502).get();
		user.getRoles().add(role);
		User newUser = this.userRepo.save(user);
		return this.modelMapper.map(newUser, UserDto.class);
	}
	
	//to get all users
	// List<User> users = this.userRepo.findAll();
	//List<UserDto> userDtos = users.stream().map(user->this.userDto(user)).collect(Colectors.toList());

}
