package com.example.demo.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 2)
@Component
public class AppRunneronStartupTwo implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("AppRunneronStartupTwo.run()");
	}

}
