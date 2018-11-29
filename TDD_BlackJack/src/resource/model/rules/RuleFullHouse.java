package resource.model.rules;

public class RuleFullHouse implements IRule {

	private String description;
	private int score;

	@Override
	public String getDescription() {
		description = "Full House";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		score = 25;
		return score;
	}

}
