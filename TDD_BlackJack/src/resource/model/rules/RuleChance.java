package resource.model.rules;

public class RuleChance implements IRule {

	private String description;
	private int score;

	@Override
	public String getDescription() {
		description = "Chance";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		for (int d : dice) {
			score += d;
		}
		return score;
	}

}
