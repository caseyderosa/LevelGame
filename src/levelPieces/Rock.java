package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Rock implements Drawable{
	private char symbol;
	private int location;
	public Rock(char symbol, int location) {
		super();
		this.symbol = symbol;
		this.location = location;
	}
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		return InteractionResult.NONE;
	}
	@Override
	public void draw() {
		System.out.print('R');
	}
	
	public int getLocation(){
		return location;
	}
	
}
