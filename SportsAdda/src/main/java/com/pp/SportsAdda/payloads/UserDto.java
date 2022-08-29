package com.pp.SportsAdda.payloads;


import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.pp.SportsAdda.Entity.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	@NotEmpty
	private String name;
	@Email
	private String email;
	@NotEmpty @Size(min = 4,message = "Username must me min of 4 characters")
	private String userName;
	@NotEmpty
	@Size(min = 4, max = 18, message = "Passwords length should be 4-10")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
	private String password;
	private Set<RoleDto> roles = new HashSet<>();

}
