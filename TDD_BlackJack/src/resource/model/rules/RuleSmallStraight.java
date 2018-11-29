package resource.model.rules;

public class RuleSmallStraight implements IRule {

	private String description;

	@Override
	public String getDescription() {
		description="Small Straight";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		
		return 0;
	}

}
