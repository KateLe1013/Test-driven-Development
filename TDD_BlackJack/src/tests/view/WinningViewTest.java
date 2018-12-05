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

	@Test
	void shouldReturnChoice() {
		sut.setChoice(1);
		assertEquals(1, sut.getChoice());
	}
	
	@Test
	void shouldReturnScore() {
		sut.setScore(50);
		assertEquals(50, sut.getScore());
	}
	
	@Test
	void shouldTestCheckWinningScoreYahtzee() throws IOException {
		int[] dice = {1,1,1,1,1};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningScoreFullHouse() throws IOException {
		int[] dice = {1,1,1,2,2};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningScoreLargeStraight() throws IOException {
		int[] dice = {2,3,4,5,6};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningScoreSmallStraight() throws IOException {
		int[] dice = {2,3,4,5,1};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningScoreFourOfAKind() throws IOException {
		int[] dice = {4,4,4,4,1};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningYathzee() throws IOException {
		when(v.readInputInt("")).thenReturn(1);
		int[] dice = {4,4,4,4,4};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningFullHouse() throws IOException {
		when(v.readInputInt("")).thenReturn(2);
		int[] dice = {4,4,4,3,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningLargeStraight() throws IOException {
		when(v.readInputInt("")).thenReturn(3);
		int[] dice = {4,5,2,3,6};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningSmallStraight() throws IOException {
		when(v.readInputInt("")).thenReturn(4);
		int[] dice = {1,2,4,3,5};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningFourOfAKind() throws IOException {
		when(v.readInputInt("")).thenReturn(5);
		int[] dice = {4,4,4,4,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningThreeOfAKind() throws IOException {
		when(v.readInputInt("")).thenReturn(6);
		int[] dice = {4,4,4,2,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningChance() throws IOException {
		when(v.readInputInt("")).thenReturn(7);
		int[] dice = {4,4,1,2,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningAces() throws IOException {
		when(v.readInputInt("")).thenReturn(8);
		int[] dice = {4,4,1,1,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningTwos() throws IOException {
		when(v.readInputInt("")).thenReturn(9);
		int[] dice = {4,2,5,2,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningThrees() throws IOException {
		when(v.readInputInt("")).thenReturn(10);
		int[] dice = {4,4,3,2,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	@Test
	void shouldTestCheckWinningFours() throws IOException {
		when(v.readInputInt("")).thenReturn(11);
		int[] dice = {4,4,5,2,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	
	@Test
	void shouldTestCheckWinningFives() throws IOException {
		when(v.readInputInt("")).thenReturn(12);
		int[] dice = {4,5,5,5,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}
	@Test
	void shouldTestCheckWinningSixes() throws IOException {
		when(v.readInputInt("")).thenReturn(13);
		int[] dice = {6,6,5,2,3};
		int[] win = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	    sut.checkWinning(win,dice);
	    verify(v,times(1)).readInputInt("");
	}	
}