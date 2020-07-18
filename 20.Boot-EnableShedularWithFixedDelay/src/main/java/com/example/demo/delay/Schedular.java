package com.example.demo.delay;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Schedular {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedDelay = 5000)
	public void reportCurrentTime() {
		System.err.println("Current Time :"+DATE_FORMAT.format(new Date()));
	}
}
