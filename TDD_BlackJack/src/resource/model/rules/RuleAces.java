package resource.model.rules;

public class RuleAces implements IRule {

	private String description;
	private int score;

	@Override
	public String getDescription() {
		description = "Aces";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		for (int d : dice) {
			if (d == 1) {
				score += 1;
			}
		}
		return score;
	}
}
