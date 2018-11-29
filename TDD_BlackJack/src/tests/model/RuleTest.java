package tests.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import resource.model.rules.IRule;
import resource.model.rules.RuleAces;
import resource.model.rules.RuleThrees;
import resource.model.rules.RuleTwos;

class RuleTest {
	private IRule sut;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRuleAcesDescription() {
		sut = new RuleAces();
		assertEquals("Aces", sut.getDescription());
	}
	
	@Test
	void testRuleAcesScores() {
		sut = new RuleAces();
		
		int []dice = {1,1,1,1,1};
		assertEquals(5, sut.getScore(dice));
	}
	
	@Test
	void testRuleTwosDescription() {
		sut = new RuleTwos();
		assertEquals("Twos", sut.getDescription());
	}
	
	@Test
	void testRuleTwosScores() {
		sut = new RuleTwos();
		
		int []dice = {1,2,1,2,1};
		assertEquals(4, sut.getScore(dice));
	}
	
	@Test
	void testRuleThreesDescription() {
		sut = new RuleThrees();
		assertEquals("Threes", sut.getDescription());
	}

}