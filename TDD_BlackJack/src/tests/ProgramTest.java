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
		sut.play();
		verify(view).showWelcome();
	}
	
	@Test
	void shouldreadInput() throws IOException {
		sut.play();
		verify(view).readInput();
	}
	
	@Test
	void shouldQuitAndShowExit() throws IOException {
		when(view.quit()).thenReturn(true);
		sut.play();
		verify(view).quit();
		verify(view).showExit();
	}
}
