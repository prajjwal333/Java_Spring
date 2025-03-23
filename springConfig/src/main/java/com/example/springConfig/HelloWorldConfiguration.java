package com.example.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age , Address address) {};

record Address(String firstLine , String city) {};

// Mention the annotation to Make this class Configuration
@Configuration
public class HelloWorldConfiguration {
	
	// Beans are necessary to be called by context...
	@Bean
	public  String name()
	{
		return "Prajjwal";
	}
	
	@Bean
	public  int age()
	{
		return 15;
	}
	
	// Approach -1 Basic approach
	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("lal Galli", "japan"));
	}
	
	
	// Approach -2 using defined beans to be reused
	@Bean
	public Person person2() {
		return new Person(name(), age(), address());
	}
	
	// Approach-3 using parameters
	@Bean
	public Person person3(String name , int age , Address address2) {
		return new Person(name, age, address2);
		
	}
	
	
	@Bean (name ="address2")
	public Address address() {
		return new Address("Bansal Galli", "Almora");
	}
	
	@Bean 
	@Primary
	
	public Address address3() {
		return new Address("hauz khas", "delhi");
	}
	

}
