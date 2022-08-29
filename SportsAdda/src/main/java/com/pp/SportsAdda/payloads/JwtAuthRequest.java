package com.pp.SportsAdda.payloads;

import lombok.Data;

@Data
public class JwtAuthRequest {
	private String username;// which is email
	private String password;
}
