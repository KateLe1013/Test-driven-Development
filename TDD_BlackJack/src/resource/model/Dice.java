package resource.model;

import java.util.Random;

public class Dice {

	private int value;
	private boolean selected = true;

	public int getValue() {
		return value;
	}

	public void setValue(int i) {
		value = i;
	}

	public int rollDice() {
		value = new Random().nextInt(6) + 1;
		return value;
	}

	public boolean isSelected() {
		return selected;
	}

	public void select() {
		selected=true;
	}

	public void unselect() {
		selected=false;
	}
}
