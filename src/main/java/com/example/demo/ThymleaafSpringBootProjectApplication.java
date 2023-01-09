package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymleaafSpringBootProjectApplication implements CommandLineRunner {
	@Autowired
	ProRepo pr;
	public static void main(String[] args) {
		SpringApplication.run(ThymleaafSpringBootProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product p = new Product();
		p.setName("Samasung");
		p.setBrand("Mobile");
//		pr.save(p);
		
	}

}
