package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.io.IOException;

import resource.Program;
import resource.model.Dice;
import resource.view.View;
import resource.view.WinningView;

class ProgramTest {
	Program sut;
	Dice dice;
	View view;
	WinningView wv;

	@BeforeEach
	void setUp() throws Exception {
		dice = mock(Dice.class);
		view = mock(View.class);
		wv=mock(WinningView.class);
		sut = new Program(dice, view, wv);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldWelcome() throws IOException {
		when(view.quit()).thenReturn(true);
		sut.play();
		verify(view).showWelcome();
	}
	
	@Test
	void shouldreadInput() throws IOException {
		when(view.quit()).thenReturn(true);
		sut.play();
		verify(view).readInput();
	}
	
	@Test
	void shouldQuitAndShowExit() throws IOException {
		when(view.roll()).thenReturn(true).thenReturn(false);
		when(view.quit()).thenReturn(true);
		when(wv.getChoice()).thenReturn(1);
		sut.play();
		
		verify(view).quit();
		verify(view).showExit();
		verify(view).showWelcome();
		verify(view,times(2)).readInput();
		verify(view,times(2)).roll();
	}
	
	@Test
	void shouldRollAndShowDice() throws IOException {
		when(view.roll()).thenReturn(true).thenReturn(false);
		when(view.quit()).thenReturn(true);
		when(wv.getChoice()).thenReturn(1);
		int[]dice={0,0,0,0,0};
		sut.play();
		verify(view).showDice(dice);
		verify(wv).getChoice();
	}
	
	@Test
	void shouldHaveBonus() throws IOException {
		when(view.roll()).thenReturn(true).thenReturn(false);
		when(wv.getChoice()).thenReturn(11);
		when(wv.getScore()).thenReturn(66);
		sut.play();
		verify(view,times(2)).roll();
		verify(wv).getScore();
		verify(wv,times(3)).getChoice();
	}
	
	@Test
	void shouldReroll() throws IOException {
		when(view.roll()).thenReturn(true).thenReturn(false);
		when(view.readInputInt("How many dices do you want to reroll? (0-5) ")).thenReturn(5);
		when(view.readInputInt("Which one? ")).thenReturn(1).thenReturn(2).thenReturn(3).thenReturn(4).thenReturn(5);
		when(wv.getChoice()).thenReturn(11);
		int[]dice={0,0,0,0,0};
		sut.play();
		verify(view,times(3)).showDice(dice);
		verify(view,times(2)).roll();
		verify(wv,times(1)).getChoice();
		verify(view,times(2)).readInputInt("How many dices do you want to reroll? (0-5) ");
		verify(view,times(10)).readInputInt("Which one? ");
	}
	
	@Test
	void shouldExitWhenGameOver() throws IOException {
		when(view.roll()).thenReturn(true).thenReturn(false);
		when(view.quit()).thenReturn(false);
		when(wv.getChoice()).thenReturn(11);
		when(wv.getScore()).thenReturn(1);
		int[]dice={0,0,0,0,0};
		sut.play();
		verify(view).showDice(dice);
		verify(view,times(2)).roll();
		verify(wv).getScore();
		verify(wv).getChoice();
		verify(view).quit();
		verify(view).showWelcome();
		verify(view,times(2)).readInput();
	}
}
