package resource.model.rules;

public class RuleLargeStraight implements IRule {

	private String description;
	private int score;

	@Override
	public String getDescription() {
		description = "Large Straight";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		score = 40;
		return score;
	}

}
