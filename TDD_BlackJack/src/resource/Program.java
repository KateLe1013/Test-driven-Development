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
		System.out.print("\nSelect 'R' to roll, 'Q' to quit: ");
		view.readInput();
		fail();
	}
}
