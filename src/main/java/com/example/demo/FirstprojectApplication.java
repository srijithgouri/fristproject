package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FirstprojectApplication.class, args);
		System.out.println("Welcome boot.....");
		Alien a=context.getBean(Alien.class);
		a.show();
		
//		Alien a1=context.getBean(Alien.class);
//		a1.show();	
//		By default spring frame work  single turn design patterns
		
	}

}
