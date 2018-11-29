package resource.model.rules;

public class RuleFullHouse implements IRule {

	private String description;

	@Override
	public String getDescription() {
		description = "Full House";
		return description;
	}

	@Override
	public int getScore(int[] dice) {

		return 0;
	}

}
