package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

// This is an abstract class because it contains an abstract 
// method AND an instance variable
public abstract class GamePiece implements Drawable {
	// Interfaces cannot have instance variables
	private char symbol;
	// Stores the piece location, which will be needed to interact
	// with the player. 
	private int location;

	public GamePiece(char symbol, int location) {
		super();
		this.symbol = symbol;
		this.location = location;
	}

	public void draw() {
		System.out.print(symbol);
	}

	public abstract InteractionResult interact(Drawable [] pieces, int playerLocation);

	public int getLocation() {
		return location;
	}
	
	public void setLocation(int newLocation) {
		if (newLocation >= 0 && newLocation < GameEngine.BOARD_SIZE)
			location = newLocation;
	}
}
