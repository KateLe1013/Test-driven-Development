package resource.view;

import java.io.IOException;

public class View {
	public static final String WELCOME = "Welcome to Yahtzee";
	public static final String EXIT = "Welcome back!";
	public static String QUIT = "Q";
	public static String ROLL = "R";
	private Console console;
	public String input;
	public int inputInt;
	
	public View(Console c) {
		console = c;
	}

	public void showWelcome() {
		console.writeLine(WELCOME);
	}

	public void showExit() {
		console.writeLine(EXIT);
	}

	public void readInput() throws IOException {
		input = console.readLine();
	}

	public boolean quit() {
		if (input.startsWith(QUIT)) {
			return true;
		}
		return false;
	}

	public boolean roll() {
		if (input.startsWith(ROLL)) {
			return true;
		}
		return false;
	}

	public void showDice(int[] dice) {
		console.writeLine("Dice1: " + dice[0] + ", Dice2: " + dice[1] + ", Dice3: " + dice[2] + ", Dice4: " + dice[3]
				+ ", Dice5: " + dice[4] + "");
	}
	
	public int readInputInt(String s) {
		inputInt=console.inputInt(s);
		return inputInt;
	}
}
