package com.pp.SportsAdda.Controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pp.SportsAdda.Services.UserServ;
import com.pp.SportsAdda.payloads.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserServ userServ;
	
	//Create User
	@PostMapping("/create")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){
		UserDto createdUserDto = this.userServ.createUser(userDto);
		return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getUser(@PathVariable("userId") Integer id){
		UserDto userDetails = this.userServ.getUser(id);
		return new ResponseEntity<UserDto>(userDetails, HttpStatus.OK);
	}
}
