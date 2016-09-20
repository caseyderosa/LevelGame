package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

public class LevelEngine {
	private Drawable[] pieces = new Drawable[GameEngine.BOARD_SIZE];
	private ArrayList<GamePiece> interactingPieces = new ArrayList<GamePiece>();
	private ArrayList<Moveable> movingPieces = new ArrayList<Moveable>();
	private int playerStart;


	public void createLevel(int levelNum) {
		switch(levelNum){
		case 1:
			level1();
			break;
		case 2:
			level2();
			break;
		}

		
	}

	
	private void level1(){
		interactingPieces = new ArrayList<GamePiece>();
		movingPieces = new ArrayList<Moveable>();
		pieces = new Drawable[GameEngine.BOARD_SIZE];
		playerStart = 0;
		Rock rock = new Rock('R', 5);
		Sawblade sawblade = new Sawblade('S', 7);
		Merchant merchant = new Merchant('M', 10);
		Candy candy = new Candy('C', 19);
		pieces[merchant.getLocation()] = merchant;
		pieces[rock.getLocation()] = rock;
		pieces[sawblade.getLocation()] = sawblade;
		pieces[candy.getLocation()] = candy;
		interactingPieces.add(candy);
		interactingPieces.add(merchant);
		interactingPieces.add(sawblade);
		movingPieces.add(merchant);
	}
	
	private void level2() {
		movingPieces = new ArrayList<Moveable>();
		interactingPieces = new ArrayList<GamePiece>();
		pieces = new Drawable[GameEngine.BOARD_SIZE];
		playerStart = 0;
		Merchant merch = new Merchant('M', 15);
		Portal portal = new Portal('O', 20);
		ReallyLongStick stick1 = new ReallyLongStick('-', 3);
		ReallyLongStick stick2 = new ReallyLongStick('-', 7);
		ReallyLongStick stick3 = new ReallyLongStick('-', 11);
		pieces[portal.getLocation()] = portal;
		pieces[merch.getLocation()] = merch;
		pieces[stick1.getLocation()] = stick1;
		pieces[stick2.getLocation()] = stick2;
		pieces[stick3.getLocation()] = stick3;
		interactingPieces.add(merch);
		interactingPieces.add(portal);
		interactingPieces.add(stick1);
		interactingPieces.add(stick2);
		interactingPieces.add(stick3);
		movingPieces.add(merch);
		movingPieces.add(portal);
		
	}

	public Drawable[] getPieces() {
		return pieces;
	}

	public ArrayList<Moveable> getMovingPieces() {
		return movingPieces;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;
	}

	public int getPlayerStartLoc() {
		return playerStart;
	}


}
