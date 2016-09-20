package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class ReallyLongStick extends GamePiece{

	public ReallyLongStick(char symbol, int location) {
		super(symbol, location);
	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if (java.lang.Math.abs(getLocation() - playerLocation) < 2 && getLocation() != playerLocation){
			return InteractionResult.HIT;
		}
		return null;
	}

}
