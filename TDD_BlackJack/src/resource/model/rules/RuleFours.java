package resource.model.rules;

public class RuleFours implements IRule {

	private String description;
	private int score;

	@Override
	public String getDescription() {
		description = "Fours";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		for (int d : dice) {
			if (d == 4) {
				score += 4;
			}
		}
		return score;
	}

}
