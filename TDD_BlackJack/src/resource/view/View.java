package resource.view;

public class View {
	private Console console;

	public View(Console c) {
		console = c;
	}

	public String showWelcome() {
		return "Welcome to Yahtzee";
	}

}
