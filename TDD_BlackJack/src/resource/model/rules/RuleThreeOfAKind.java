package resource.model.rules;

public class RuleThreeOfAKind implements IRule {

	private String description;

	@Override
	public String getDescription() {
		description="Three Of A Kind";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		return 23;
	}

}
