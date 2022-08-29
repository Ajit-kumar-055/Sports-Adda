package com.pp.SportsAdda.Services;

import com.pp.SportsAdda.payloads.UserDto;

public interface UserServ {
	UserDto registerNewUser(UserDto userDto);
	UserDto createUser(UserDto userDto);
	UserDto updateUser(UserDto userDto, Integer id);
	UserDto getUser(Integer id);
	void deleteUser(UserDto userDto, Integer id);

}
