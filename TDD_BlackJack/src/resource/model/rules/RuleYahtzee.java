package resource.model.rules;

public class RuleYahtzee implements IRule {

	private String description;

	@Override
	public String getDescription() {
		description = "Yahtzee";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
	
		return 50;
	}

}
