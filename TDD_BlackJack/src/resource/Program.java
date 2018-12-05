package resource;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Random;

import org.junit.jupiter.api.Test;

import resource.model.Dice;
import resource.view.Console;
import resource.view.View;
import resource.view.WinningView;

public class Program {
	private Dice dice;
	private View view;
    private WinningView wv;
    
	public Program(Dice dice, View view, WinningView wView) {
		this.dice = dice;
		this.view = view;
		this.wv = wView;
	}

	public static void main(String[] args) throws IOException {
		View view = new View(new Console());
		Program game = new Program(new Dice(), view, new WinningView(view));
		game.play();
	}

	public void play() throws IOException {
		view.showWelcome();
		
		int score = 0, sum = 0; 
		Random r = new Random();
		int[] win = new int[13];
		System.out.print("\nSelect 'R' to roll, 'Q' to quit: ");
		view.readInput();
		while (view.roll() && (sum < 13)) {
			sum = 0;
			int[] dices = new int[] { 0, 0, 0, 0, 0 };// creates an array
			int roll = 0;
			int reroll_dices = 0; // the number of dices
			int reroll_which_dice = 0; // Which dice

			for (int x = 0; x < 5; x++) {
				dice.rollDice(r);
				dices[x] = dice.getValue();// sets the dice values
			}
			view.showDice(dices);

			do {
				reroll_dices = view.readInputInt("How many dices do you want to reroll? (0-5) ");
				if (reroll_dices > 0) {
					int[] reroll = new int[reroll_dices];
					for (int y = 0; y < reroll_dices; y++) {
						reroll_which_dice = view.readInputInt("Which one? ");
						reroll[y] = reroll_which_dice;
					}
					for (int w = 0; w < reroll_dices; w++) {
						if (reroll[w] == 1) {
							dice.rollDice(r);
							dices[0] = dice.getValue();
						}
						if (reroll[w] == 2) {
							dice.rollDice(r);
							dices[1] = dice.getValue();
						}
						if (reroll[w] == 3) {
							dice.rollDice(r);
							dices[2] = dice.getValue();
						}
						if (reroll[w] == 4) {
							dice.rollDice(r);
							dices[3] = dice.getValue();
						}
						if (reroll[w] == 5) {
							dice.rollDice(r);
							dices[4] = dice.getValue();
						}
					}
					roll++;
					view.showDice(dices);
				}
			} while ((roll < 2) && (reroll_dices > 0));
			wv.checkWinning(win, dices);
			win[wv.getChoice() - 1] = 1;
			for (int z = 0; z < win.length; z++) {
				sum += win[z];
			}
			score += wv.getScore();
			if (score >= 63 && (wv.getChoice() >= 8 && wv.getChoice() <= 13)) {
				score += 35; // 35 is a bonus
			}
			System.out.println("Your total score is: " + score);
			if (sum < 13) {
				System.out.println("Do you want to play again? Select 'R' to roll, 'Q' to quit: ");
				view.readInput();
				if (view.quit()) {
					view.showExit();
				}
			} else {
				System.out.println("GAME OVER!");
				view.showExit();
			}
		}
	}
}
