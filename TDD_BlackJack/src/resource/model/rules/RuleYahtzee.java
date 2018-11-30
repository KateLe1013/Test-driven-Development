package resource.model.rules;

public class RuleYahtzee implements IRule {

	private String description;
	private int score;

	@Override
	public String getDescription() {
		description = "Yahtzee";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		score = 50;
		return score;
	}

}
