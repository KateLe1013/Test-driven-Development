package resource.model;

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
		
		return 0;
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
