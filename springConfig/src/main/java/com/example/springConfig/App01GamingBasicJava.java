package com.example.springConfig;

import com.example.springConfig.game.GameRunner;
import com.example.springConfig.game.MarioGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
