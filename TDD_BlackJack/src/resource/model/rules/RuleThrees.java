package resource.model.rules;

public class RuleThrees implements IRule {
	private String description;

	@Override
	public String getDescription() {
		description = "Threes";
		return description;
	}

	@Override
	public int getScore(int[] dice) {

		return 6;
	}

}
