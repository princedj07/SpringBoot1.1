package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		String [] beans = context.getBeanDefinitionNames();
		Arrays.sort(beans);
		for (String beanName : beans) {
			System.out.println(beanName +" of Type :: "+ context.getBean(beanName).getClass());
		}
	}

}
