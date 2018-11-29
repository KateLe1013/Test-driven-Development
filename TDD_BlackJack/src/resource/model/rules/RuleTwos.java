package resource.model.rules;

public class RuleTwos implements IRule {

	private String description;
	private int score;

	@Override
	public String getDescription() {
		description="Twos";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		for (int d : dice) {
			if (d == 2) {
				score += 2;
			}
		}
		return score;
	}

}
