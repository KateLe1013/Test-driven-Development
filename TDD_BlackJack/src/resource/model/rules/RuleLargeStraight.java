package resource.model.rules;

public class RuleLargeStraight implements IRule {

	private String description;

	@Override
	public String getDescription() {
		description = "Large Straight";
		return description;
	}

	@Override
	public int getScore(int[] dice) {

		return 0;
	}

}
