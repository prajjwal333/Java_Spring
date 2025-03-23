package com.example.springConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springConfig.game.GameRunner;
import com.example.springConfig.game.MarioGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		
		//Creating Spring Context with a defined Configuration Class
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2"));
		
		System.out.println(context.getBean("person3"));

		
		System.out.println(context.getBean(Address.class));
		
				
				
	}

}
