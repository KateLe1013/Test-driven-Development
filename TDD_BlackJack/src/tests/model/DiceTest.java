package tests.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import resource.model.Dice;

class DiceTest {

	private Dice sut;

	@BeforeEach
	void setUp() throws Exception {
		sut = new Dice();
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
		checkRandomNumberRange(sut.rollDice());
	}
	
	@Test
	void shouldTestIsSelected() {
		assertTrue(sut.isSelected());
	}
	
	@Test
	void shouldTestSelect() {
		assertTrue(sut.select());
	}

	private void checkRandomNumberRange(int value) {
		int low = 1;
		int high = 6;

		if (value < low) {
			fail("Value of the dice is lower than 1.");
		}

		if (value > high) {
			fail("Value of the dice is higher than 6.");
		}
	}

}
