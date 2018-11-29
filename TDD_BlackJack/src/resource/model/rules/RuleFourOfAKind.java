package resource.model.rules;

public class RuleFourOfAKind implements IRule {
	private String description;
	private int score;

	@Override
	public String getDescription() {
		description = "Four Of A Kind";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		for (int d : dice) {
			score+=d;
		}
		return score;
	}

}
