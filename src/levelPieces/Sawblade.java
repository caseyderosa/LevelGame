package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Sawblade extends GamePiece{
	public Sawblade(char symbol, int location) {
		super(symbol, location);
	}

	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if (playerLocation == getLocation()){
		return InteractionResult.KILL;
		}
		return InteractionResult.NONE;
	}

}
