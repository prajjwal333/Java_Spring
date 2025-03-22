package com.example.gameRunner;

import com.example.gameRunner.game.GameRunner;
import com.example.gameRunner.game.MarioGame;
import com.example.gameRunner.game.PacMan;
import com.example.gameRunner.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		// create instance of Mario Game
//		var game = new MarioGame();
		
		// create instance of SuperContra Game
		// var game = new SuperContraGame();
		
		// create instance of PacMan Game
		var game = new PacMan();
		
		// in the gamerunner pass the mariogame or SuperContraGame in constructor
		var gameRunner = new GameRunner(game);
		
		// run the game
		gameRunner.run();
		

	}

}
