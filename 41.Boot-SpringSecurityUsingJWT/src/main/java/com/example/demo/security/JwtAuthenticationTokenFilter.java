package com.example.demo.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import com.example.demo.model.JwtAuthenticationToken;

public class JwtAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter {

	public JwtAuthenticationTokenFilter() {
		super("/rest/**");
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {

		System.err.println("JwtAuthenticationTokenFilter.attemptAuthentication()");
		String header = httpServletRequest.getHeader("Authorisation");

		if (header == null || !header.startsWith("Token ")) {
			System.err.println("JwtAuthenticationTokenFilter.attemptAuthentication()");
			throw new RuntimeException("JWT Token is missing");
		}

		String authenticationToken = header.substring(6);

		JwtAuthenticationToken token = new JwtAuthenticationToken(authenticationToken);
		return getAuthenticationManager().authenticate(token);
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		System.err.println("JwtAuthenticationTokenFilter.successfulAuthentication()");
		super.successfulAuthentication(request, response, chain, authResult);
		System.err.println("JwtAuthenticationTokenFilter.successfulAuthentication()");
		chain.doFilter(request, response);
		System.err.println("JwtAuthenticationTokenFilter.successfulAuthentication()");
	}
}