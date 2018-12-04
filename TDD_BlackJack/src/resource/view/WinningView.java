package resource.view;

import java.io.IOException;
import java.util.Arrays;

import resource.model.rules.IRule;
import resource.model.rules.RuleAces;
import resource.model.rules.RuleChance;
import resource.model.rules.RuleFives;
import resource.model.rules.RuleFourOfAKind;
import resource.model.rules.RuleFours;
import resource.model.rules.RuleFullHouse;
import resource.model.rules.RuleLargeStraight;
import resource.model.rules.RuleSixes;
import resource.model.rules.RuleSmallStraight;
import resource.model.rules.RuleThreeOfAKind;
import resource.model.rules.RuleThrees;
import resource.model.rules.RuleTwos;
import resource.model.rules.RuleYahtzee;

public class WinningView {
	private IRule rule;
	private View view;
	private int choice;
	private int totalScore;

	public WinningView(View v) {
		view = v;
	}

	public void checkWinning(int[] win, int[] dice) throws IOException {
		checkWinningRule(win);
		checkWinningScore(dice);
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

	private int checkWinningScore(int[] dice) {
		Arrays.sort(dice);

		if (isSmallStraight(dice) && (choice == 4)) {
			System.out.println("You have Small Straight!");
			rule = new RuleSmallStraight();
			totalScore = rule.getScore(dice);
		} else if (isLargeStraight(dice) && (choice == 3)) {
			System.out.println("You have Large Straight!");
			rule = new RuleLargeStraight();
			totalScore = rule.getScore(dice);
		} else if (isFullHouse(dice) && (choice == 2)) {
			System.out.println("You have Full House!");
			rule = new RuleFullHouse();
			totalScore = rule.getScore(dice);
		} else if (isYahtzee(dice) && (choice == 1)) {
			System.out.println("Yahtzee!");
			rule = new RuleYahtzee();
			totalScore = rule.getScore(dice);
		} else if (isFourOfAKind(dice) && (choice == 5)) {
			System.out.println("You have Four Of A Kind!");
			rule = new RuleFourOfAKind();
			totalScore = rule.getScore(dice);
		} else if (isThreeOfAKind(dice) && (choice == 6)) {
			System.out.println("You have Three Of A Kind!");
			rule = new RuleThreeOfAKind();
			totalScore = rule.getScore(dice);
		} else if (choice == 7) {
			System.out.println("Chance!");
			rule = new RuleChance();
			totalScore = rule.getScore(dice);
		} else if (choice == 8) {
			System.out.println("You have Aces!");
			rule = new RuleAces();
			totalScore = rule.getScore(dice);
		} else if (choice == 9) {
			System.out.println("You have Twos!");
			rule = new RuleTwos();
			totalScore = rule.getScore(dice);
		} else if (choice == 10) {
			System.out.println("You have Threes!");
			rule = new RuleThrees();
			totalScore = rule.getScore(dice);
		} else if (choice == 11) {
			System.out.println("You have Fours!");
			rule = new RuleFours();
			totalScore = rule.getScore(dice);
		} else if (choice == 12) {
			System.out.println("You have Fives!");
			rule = new RuleFives();
			totalScore = rule.getScore(dice);
		} else if (choice == 13) {
			System.out.println("You have Sixes!");
			rule = new RuleSixes();
			totalScore = rule.getScore(dice);
		}
		return totalScore;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int i) {
		choice = i;
	}

	public int getScore() {
		return totalScore;
	}

	public void setScore(int i) {
		totalScore = i;
	}

	private boolean isThreeOfAKind(int[] dice) {
		int counter = 0;
		int[] specifyCountTimes = new int[6];
		for (int i = 1; i <= dice.length + 1; i++) {
			specifyCountTimes[i - 1] = countSpecifyNumberTimes(i, dice);
			if (countSpecifyNumberTimes(i, dice) != 0 && countSpecifyNumberTimes(i, dice) != 1) {
				counter++;
			}
		}

		for (int i = 0; i < specifyCountTimes.length; i++) {
			if (counter != 2 && specifyCountTimes[i] == 3) {
				return true;
			}
		}
		return false;
	}

	private boolean isFourOfAKind(int[] dice) {
		for (int i = 1; i <= dice.length + 1; i++) {
			int specifyCountTimes = countSpecifyNumberTimes(i, dice);
			if (specifyCountTimes == 4) {
				return true;
			}
		}
		return false;
	}

	private boolean isYahtzee(int[] dice) {
		int countDot = 0;
		for (int i = 0; i < dice.length - 1; i++) {
			if (dice[i] == dice[i + 1]) {
				countDot++;
			}
		}
		if (countDot == 4) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isFullHouse(int[] dice) {
		int counter = 0;
		int[] specifyCountTimes = new int[6];
		for (int i = 1; i <= dice.length + 1; i++) {
			specifyCountTimes[i - 1] = countSpecifyNumberTimes(i, dice);
			if (countSpecifyNumberTimes(i, dice) != 1 && countSpecifyNumberTimes(i, dice) != 0) {
				counter++;
			}
		}

		for (int i = 0; i < specifyCountTimes.length; i++) {
			if (counter == 2 && specifyCountTimes[i] == 3) {
				return true;
			}
		}
		return false;
	}

	private boolean isLargeStraight(int[] dice) {
		int[] a = { 2, 3, 4, 5, 6 };// Correct one

		for (int i = 0; i < dice.length; i++) {
			if (a[i] != dice[i]) {
				break;
			}
			if (i == 4) {
				return true;
			}
		}
		return false;
	}

	private boolean isSmallStraight(int[] dice) {
		int[] a = { 1, 2, 3, 4, 5 };// Correct one

		for (int i = 0; i < dice.length; i++) {
			if (a[i] != dice[i]) {
				break;
			}
			if (i == 4) {
				return true;
			}
		}
		return false;
	}

	private int countSpecifyNumberTimes(int specifyNumber, int[] dice) {
		int specifyCountTimes = 0;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == specifyNumber) {
				specifyCountTimes++;
			}
		}
		return specifyCountTimes;
	}
}