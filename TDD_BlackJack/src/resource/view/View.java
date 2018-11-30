package resource.view;

public class View {
	public static final String WELCOME = "Welcome to Yahtzee";
	private Console console;

	public View(Console c) {
		console = c;
	}

	public void showWelcome() {
		console.writeLine(WELCOME);
	}

	public String showExit() {
		
		return "Welcome back!";
	}

}
