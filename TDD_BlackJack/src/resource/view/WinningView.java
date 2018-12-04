package resource.view;

import java.io.IOException;

import resource.model.rules.IRule;

public class WinningView {
	private IRule rule;
	private View view;

	public WinningView(IRule r, View v) {
		rule = r;
		view = v;
	}

	public void checkWinningRule(int[] win) throws IOException {
		throw new IOException();
	}
}