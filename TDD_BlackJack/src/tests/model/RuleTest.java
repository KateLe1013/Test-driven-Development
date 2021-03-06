package tests.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import resource.model.rules.IRule;
import resource.model.rules.RuleAces;
import resource.model.rules.RuleChance;
import resource.model.rules.RuleFives;
import resource.model.rules.RuleFourOfAKind;
import resource.model.rules.RuleFours;
import resource.model.rules.RuleFullHouse;
import resource.model.rules.RuleLargeStraight;
import resource.model.rules.RuleSixes;
import resource.model.rules.RuleSmallStraight;
import resource.model.rules.RuleThreeOfAKind;
import resource.model.rules.RuleThrees;
import resource.model.rules.RuleTwos;
import resource.model.rules.RuleYahtzee;

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
	
	@Test
	void testRuleThreesScores() {
		sut = new RuleThrees();
		
		int []dice = {1,2,3,4,3};
		assertEquals(6, sut.getScore(dice));
	}
	
	@Test
	void testRuleFoursDescription() {
		sut = new RuleFours();
		assertEquals("Fours", sut.getDescription());
	}
	
	@Test
	void testRuleFourssScores() {
		sut = new RuleFours();
		
		int []dice = {4,2,5,4,4};
		assertEquals(12, sut.getScore(dice));
	}

	@Test
	void testRuleFivesDescription() {
		sut = new RuleFives();
		assertEquals("Fives", sut.getDescription());
	}
	
	@Test
	void testRuleFivesScores() {
		sut = new RuleFives();
		
		int []dice = {4,2,5,4,4};
		assertEquals(5, sut.getScore(dice));
	}
	
	@Test
	void testRuleSixesDescription() {
		sut = new RuleSixes();
		assertEquals("Sixes", sut.getDescription());
	}
	
	@Test
	void testRuleSixesScores() {
		sut = new RuleSixes();
		
		int []dice = {1,6,6,4,6};
		assertEquals(18, sut.getScore(dice));
	}
	
	@Test
	void testRuleThreeOfAKindDescription() {
		sut = new RuleThreeOfAKind();
		assertEquals("Three Of A Kind", sut.getDescription());
	}
	
	@Test
	void testRuleThreeOfAKindScores() {
		sut = new RuleThreeOfAKind();
		
		int []dice = {1,6,6,4,6};
		assertEquals(23, sut.getScore(dice));
	}
	
	@Test
	void testRuleFourOfAKindDescription() {
		sut = new RuleFourOfAKind();
		assertEquals("Four Of A Kind", sut.getDescription());
	}
	
	@Test
	void testRuleFourOfAKindScores() {
		sut = new RuleFourOfAKind();
		
		int []dice = {1,6,6,6,6};
		assertEquals(25, sut.getScore(dice));
	}
	
	@Test
	void testRuleFullHouseDescription() {
		sut = new RuleFullHouse();
		assertEquals("Full House", sut.getDescription());
	}
	
	@Test
	void testRuleFullHouseScores() {
		sut = new RuleFullHouse();
		
		int []dice = {1,1,6,6,6};
		assertEquals(25, sut.getScore(dice));
	}
	
	@Test
	void testRuleSmallStraightDescription() {
		sut = new RuleSmallStraight();
		assertEquals("Small Straight", sut.getDescription());
	}
	
	@Test
	void testRuleSmallStraightScores() {
		sut = new RuleSmallStraight();
		
		int []dice = {1,2,3,4,6};
		assertEquals(30, sut.getScore(dice));
	}
	
	@Test
	void testRuleLargeStraightDescription() {
		sut = new RuleLargeStraight();
		assertEquals("Large Straight", sut.getDescription());
	}
	
	@Test
	void testRuleLargeStraightScores() {
		sut = new RuleLargeStraight();
		
		int []dice = {1,2,3,4,5};
		assertEquals(40, sut.getScore(dice));
	}
	
	@Test
	void testRuleYahtzeeDescription() {
		sut = new RuleYahtzee();
		assertEquals("Yahtzee", sut.getDescription());
	}

	@Test
	void testRuleYahtzeeScores() {
		sut = new RuleYahtzee();
		
		int []dice = {5,5,5,5,5};
		assertEquals(50, sut.getScore(dice));
	}
	
	@Test
	void testRuleChanceDescription() {
		sut = new RuleChance();
		assertEquals("Chance", sut.getDescription());
	}
	
	@Test
	void testRuleChanceScores() {
		sut = new RuleChance();
		
		int []dice = {1,5,4,3,6};
		assertEquals(19, sut.getScore(dice));
	}
}
