package com.example.gameRunner.game;

public class SuperContraGame  implements GamingConsole{
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Sir down");
	}
	
	public void left() {
		System.out.println("Go Back");
	}
	
	public void right() {
		System.out.println("Shoot a bullet");
	}

}
