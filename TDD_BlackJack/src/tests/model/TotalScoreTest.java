package tests.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import resource.model.rules.TotalScore;

class TotalScoreTest {
	private TotalScore sut;
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturnTotalUpperSectionScore() {
		sut=new TotalScore();
		assertEquals(6, sut.getTotalUpperSectionScore());
	}

}
