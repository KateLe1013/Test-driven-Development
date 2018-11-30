package tests.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import resource.view.Console;
import resource.view.View;

class ViewTest {
	private View sut;
	private Console c;

	@BeforeEach
	void setUp() throws Exception {
		c=mock(Console.class);
		sut=new View(c); 
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturnWelcome() {
		sut.showWelcome();
		verify(c).writeLine(View.WELCOME);
	}
	
	@Test
	void shouldReturnExit() {
		sut.showExit();
		verify(c).writeLine(View.EXIT);
	}

}
