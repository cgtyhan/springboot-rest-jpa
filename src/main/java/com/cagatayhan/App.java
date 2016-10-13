package com.cagatayhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cagatayhan"})
public class App {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(App.class, args);
	}
}
