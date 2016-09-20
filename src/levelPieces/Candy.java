package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Candy extends GamePiece{
	private int gone = 0;
	public Candy(char symbol, int location) {
		super(symbol, location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if (getLocation() == playerLocation){
			pieces[getLocation()] = null;
			gone++;
		}
		if (gone == 1){
			gone++;
			return InteractionResult.GET_POINT;
		}
		return InteractionResult.NONE;
	}

}
