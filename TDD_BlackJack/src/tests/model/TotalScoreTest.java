package tests.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import resource.model.rules.IRule;
import resource.model.rules.RuleChance;
import resource.model.rules.RuleTwos;
import resource.model.rules.TotalScore;

class TotalScoreTest {
	private TotalScore sut;
	private IRule r;

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturnTotalUpperSectionScore() {
		r=mock(RuleTwos.class);
		int []dice= {1,2,3,2,2};
		when(r.getDescription()).thenReturn(RuleTwos.class.getSimpleName().substring(4));
		when(r.getScore(dice)).thenReturn(6);
		sut=new TotalScore(r,dice);
		assertEquals(6, sut.getTotalUpperSectionScore());
		verify(r,times(1)).getDescription();
		verify(r,times(1)).getScore(dice);
	}
	
	@Test
	void shouldReturnNotTotalUpperSectionScore() {
		r=mock(RuleChance.class);
		int []dice= {1,2,3,4,2};
		when(r.getDescription()).thenReturn(RuleChance.class.getSimpleName().substring(4));
		when(r.getScore(dice)).thenReturn(12);
		sut=new TotalScore(r,dice);
		assertEquals(12, sut.getTotalUpperSectionScore());
		verify(r,times(1)).getDescription();
		verify(r,times(1)).getScore(dice);
	}

}
