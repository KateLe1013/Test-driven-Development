package tests.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import resource.model.Dice;

class DiceTest {

	private Dice sut;
	private Random r;

	@BeforeEach
	void setUp() throws Exception {
		sut = new Dice();
		r=mock(Random.class);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturnSix() {
		sut.setValue(6);
		assertEquals(6, sut.getValue());
	}

	@Test
	void shouldHaveRandomValues() {
	assertEquals(6, sut.rollDice());
	}
	
	@Test
	void shouldTestIsSelected() {
		assertTrue(sut.isSelected());
	}
	
	@Test
	void shouldTestSelect() {
		sut.select();
		assertTrue(sut.isSelected());
	}
	
	@Test
	void shouldTestUnSelect() {
		sut.unselect();
		assertEquals(false, sut.isSelected());
	}
}
