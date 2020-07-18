package com.example.demo.security;

import org.springframework.stereotype.Component;

import com.example.demo.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

	private String secret = "youtube";

	public JwtUser validate(String token) {

		System.err.println("JwtValidator.validate()");
		JwtUser jwtUser = null;
		try {
			System.err.println("JwtValidator.validate()");
			Claims body = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();

			jwtUser = new JwtUser();

			jwtUser.setUserName(body.getSubject());
			jwtUser.setId(Long.parseLong((String) body.get("userId")));
			jwtUser.setRole((String) body.get("role"));
		} catch (Exception e) {
			System.out.println(e);
		}

		return jwtUser;
	}
}