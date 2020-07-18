package com.example.demo.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 1)
@Component
public class AppRunnerOnStartupOne implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("AppRunnerOnStartupOne.run()");
	}

}
