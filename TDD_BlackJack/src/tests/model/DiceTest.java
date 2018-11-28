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
		assertEquals(6, sut.getValue());
	}

}
