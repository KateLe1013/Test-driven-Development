package resource.model;

import java.util.Random;

public class Dice {

	private int value;

	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	public void setValue(int i) {
		value = i;
	}
	
	public int rollDice() {
		value = new Random().nextInt(6)+1;
		return 6;
	}
}
