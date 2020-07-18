package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SpringSecurityConfuguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource ds;

	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		System.err.println("SpringSecurityConfuguration.configure() AuthenticationManagerBuilder");
		
		auth.jdbcAuthentication().dataSource(ds)
				.authoritiesByUsernameQuery("SELECT USERNAME, ROLE FROM USERS WHERE USERNAME=?")
				.usersByUsernameQuery("SELECT USERNAME, USERPASSWORD, 1 FROM USERS WHERE USERNAME=?");

	}

	// Secure the endpoins with HTTP Basic authentication
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		System.err.println("SpringSecurityConfuguration.configure() HttpSecurity");
		http.httpBasic().and().authorizeRequests().anyRequest().authenticated();
		http.csrf().disable();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {

		System.err.println("SpringSecurityConfuguration.passwordEncoder()");
		return new BCryptPasswordEncoder();
	}
}
