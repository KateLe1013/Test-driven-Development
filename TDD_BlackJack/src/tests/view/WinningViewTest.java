package tests.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.io.IOException;

import resource.view.View;
import resource.view.WinningView;

class WinningViewTest {

	WinningView sut;
    View v;
  
	@BeforeEach
	void setUp() throws Exception {
		v = mock(View.class);
		sut = new WinningView(v);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldTestCheckWinning() throws IOException {
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] dice = {1,1,1,2,3};
		sut.checkWinning(win,dice);
		verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningScore() throws IOException {
		int[] dice = {1,1,1,2,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}

}