package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

@Component
public class EmployeeFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.err.println("Before Sending Request To The Controller");
		System.out.println("Remote Host : "+request.getRemoteHost());
		System.out.println("Remote Adds : "+request.getRemoteAddr());
		System.out.println("Remote Port : "+request.getRemotePort());
		
		chain.doFilter(request, response);
		
		System.err.println("Before Sending Response To the Client");
		
	}

}
