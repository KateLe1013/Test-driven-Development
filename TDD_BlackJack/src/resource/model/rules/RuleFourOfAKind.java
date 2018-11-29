package resource.model.rules;

public class RuleFourOfAKind implements IRule {
	private String description;

	@Override
	public String getDescription() {
		description = "Four Of A Kind";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		return 25;
	}

}
