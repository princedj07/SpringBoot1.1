package com.example.demo.schedular;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class MySchedular {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(cron = "* * * ? * *")	//every second
	public void reportCurrentTime() {
		
		System.err.println("Current Time : "+DATE_FORMAT.format(new Date()));
	}
	
}
