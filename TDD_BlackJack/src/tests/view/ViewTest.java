package tests.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.io.IOException;

import resource.view.Console;
import resource.view.View;

class ViewTest {
	private View sut;
	private Console c;

	@BeforeEach
	void setUp() throws Exception {
		c = mock(Console.class);
		sut = new View(c);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturnWelcome() {
		sut.showWelcome();
		verify(c).writeLine(View.WELCOME);
	}

	@Test
	void shouldReturnExit() {
		sut.showExit();
		verify(c).writeLine(View.EXIT);
	}

	@Test
	void shouldReadInput() throws IOException {
		sut.readInput();
		verify(c, times(1)).readLine();
	}

	@Test
	void shouldQuit() throws IOException {
		when(c.readLine()).thenReturn(View.QUIT);
		sut.readInput();
		boolean actual = sut.quit();
		assertTrue(actual);
	}

	@Test
	void shouldRoll() throws IOException {
		when(c.readLine()).thenReturn(View.ROLL);
		sut.readInput();
		boolean actual = sut.roll();
		assertTrue(actual);
	}

	@Test
	void shouldNotRoll() throws IOException {
		when(c.readLine()).thenReturn(View.QUIT);
		sut.readInput();
		boolean actual = sut.roll();
		assertFalse(actual);
	}

	@Test
	void shouldNotQuit() throws IOException {
		when(c.readLine()).thenReturn(View.ROLL);
		sut.readInput();
		boolean actual = sut.quit();
		assertFalse(actual);
	}

	@Test
	void shouldShowDice() {
		int [] dice = {1,2,3,4,5};
		showDiceArray(dice);
	}

	private void showDiceArray(int [] dice) {
		assertEquals("Dice1: " + dice[0] + ", Dice2: " + dice[1] + ", Dice3: " + dice[2] + ", Dice4: " + dice[3]
				+ ", Dice5: " + dice[4] + " ",sut.showDice(dice));
	}

}
