package com.etour.securityconfig;

public class JwtResponse 
{
	private String token ;

	public JwtResponse() {
		super();
	}

	@Override
	public String toString() {
		return "JwtResponse [token=" + token + "]";
	}

	public JwtResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	

}
