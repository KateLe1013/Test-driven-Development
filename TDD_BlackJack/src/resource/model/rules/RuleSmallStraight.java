package resource.model.rules;

public class RuleSmallStraight implements IRule {

	private String description;
	private int score;

	@Override
	public String getDescription() {
		description = "Small Straight";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		score = 30;
		return score;
	}

}
