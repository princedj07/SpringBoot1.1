package com.example.demo.container;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class CustomContainer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory>{

	@Override
	public void customize(TomcatServletWebServerFactory factory) {
		System.out.println("CustomContainer.customize()");
		
		factory.setPort(9090);
		factory.setContextPath("/myBoot");
		
	}

}
