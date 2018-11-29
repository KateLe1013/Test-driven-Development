package resource.model.rules;

public class RuleThrees implements IRule {
	private String description;
	private int score;

	@Override
	public String getDescription() {
		description = "Threes";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		for (int d : dice) {
			if (d == 3) {
				score += 3;
			}
		}
		return score;
	}

}
