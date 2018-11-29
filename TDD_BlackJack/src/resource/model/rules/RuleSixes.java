package resource.model.rules;

public class RuleSixes implements IRule {
	private String description;
	private int score;
	
	@Override
	public String getDescription() {
		description="Sixes";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		for (int d : dice) {
			if (d == 6) {
				score += 6;
			}
		}
		return score;
	
	}

}
