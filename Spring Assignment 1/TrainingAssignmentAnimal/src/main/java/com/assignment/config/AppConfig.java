package com.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.assignment.bean.Animal;
import com.assignment.bean.LandAnimal;
import com.assignment.bean.Person;
import com.assignment.bean.WaterAnimal;

@Configuration
public class AppConfig {
	@Bean("animal")
	public Animal getAnimal() {

		Animal a = new WaterAnimal("Whale", "Orca", true, "water");
		return a;

	}

	@Bean("person")
	public Person getPerson() {
		Person p = new Person("Sohini", 21);
		return p;
	}

	@Bean("petAnimal")
	public LandAnimal getPetAnimal() {

		LandAnimal a = new LandAnimal("Dog", "Spanial", false, "kanel");
		return a;

	}

}
