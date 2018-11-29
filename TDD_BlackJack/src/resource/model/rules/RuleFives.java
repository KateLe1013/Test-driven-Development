package resource.model.rules;

public class RuleFives implements IRule {
	private String description;
	private int score;
	
	@Override
	public String getDescription() {
		description="Fives";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		for (int d : dice) {
			if (d == 5) {
				score += 5;
			}
		}
		return score;
	}

}
