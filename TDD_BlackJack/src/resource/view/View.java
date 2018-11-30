package resource.view;

public class View {
	public static final String WELCOME = "Welcome to Yahtzee";
	public static final String EXIT = "Welcome back!";
	private Console console;

	public View(Console c) {
		console = c;
	}

	public void showWelcome() {
		console.writeLine(WELCOME);
	}

	public void showExit() {
		console.writeLine(EXIT);
	}

}
