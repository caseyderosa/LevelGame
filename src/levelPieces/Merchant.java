package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Merchant extends GamePiece implements Moveable{
	private int gone = 0;
	public Merchant(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if ((java.lang.Math.abs(playerLocation - getLocation()) < 3) &&
				(getLocation() == GameEngine.BOARD_SIZE - 1)){
			pieces[getLocation()] = null;
			gone++;
		}
		if (gone == 1){
			return InteractionResult.GET_POINT;
		}
		return InteractionResult.NONE;
	}

	@Override
	public void move(Drawable[] pieces, int playerLocation) {
		if (getLocation() + 1 == GameEngine.BOARD_SIZE){
		}
		else {
			int i = 0;
			Drawable temp = pieces[getLocation()];
			while (pieces[getLocation() + i] != null){
				i++;
			}
			setLocation(getLocation() + i);
			pieces[getLocation() - i] = null;
			pieces[getLocation()] = temp;
		}
	}

}

