package resource.view;

import java.io.IOException;

import resource.model.rules.IRule;

public class WinningView {
	private IRule rule;
	private View view;
	private int choice;

	public WinningView(IRule r, View v) {
		rule = r;
		view = v;
	}
	
	public void checkWinning(int []win, int []dice) throws IOException {
		checkWinningRule(win);
	}

	private void checkWinningRule(int[] win) throws IOException {
		System.out.println("Which do you want to see if you have?");
		if (win[0] == 0) {
			System.out.println("1 - Yathzee");
		}
		if (win[1] == 0) {
			System.out.println("2 - Full House");
		}
		if (win[2] == 0) {
			System.out.println("3 - Large Straigt");
		}
		if (win[3] == 0) {
			System.out.println("4 - Small Straigt");
		}
		if (win[4] == 0) {
			System.out.println("5 - Four Of A Kind");
		}
		if (win[5] == 0) {
			System.out.println("6 - Three Of A Kind");
		}
		if (win[6] == 0) {
			System.out.println("7 - Chance");
		}
		if (win[7] == 0) {
			System.out.println("8 - 1's");
		}
		if (win[8] == 0) {
			System.out.println("9 - 2's");
		}
		if (win[9] == 0) {
			System.out.println("10 - 3's");
		}
		if (win[10] == 0) {
			System.out.println("11 - 4's");
		}
		if (win[11] == 0) {
			System.out.println("12 - 5's");
		}
		if (win[12] == 0) {
			System.out.println("13 - 6's");
		}
		choice = view.readInputInt("");
	}
}