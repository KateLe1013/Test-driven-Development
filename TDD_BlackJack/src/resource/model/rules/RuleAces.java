package resource.model.rules;

public class RuleAces implements IRule {

	private String description;

	@Override
	public String getDescription() {
		description = "Aces";
		return description;
	}

	@Override
	public int getScore(int[] dice) {

		return 5;
	}
}
