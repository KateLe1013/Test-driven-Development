package resource.view;

import java.io.IOException;

public class View {
	public static final String WELCOME = "Welcome to Yahtzee";
	public static final String EXIT = "Welcome back!";
	private Console console;
	String input;

	public View(Console c) {
		console = c;
	}

	public void showWelcome() {
		console.writeLine(WELCOME);
	}

	public void showExit() {
		console.writeLine(EXIT);
	}

	public String readInput() throws IOException {
		input = console.readLine();
		input="string";
		return input;
	}

}
