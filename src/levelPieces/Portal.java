package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.util.Random;

public class Portal extends GamePiece implements Moveable{

	public Portal(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if (getLocation() == playerLocation){
			return InteractionResult.ADVANCE;
		}
		return InteractionResult.NONE;
	}

	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		Random rMove = new Random();
		int past = getLocation();
		Drawable temp = pieces[getLocation()];
		while (pieces[getLocation()] != null) {
			setLocation(Math.abs(rMove.nextInt(GameEngine.BOARD_SIZE - 1)));
		}

		pieces[past] = null;
		pieces[getLocation()] = temp;
	}
}
