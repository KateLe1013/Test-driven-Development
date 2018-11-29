package tests.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import resource.model.rules.IRule;
import resource.model.rules.RuleAces;

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

}
