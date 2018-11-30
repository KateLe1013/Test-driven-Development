package resource.model.rules;

public class RuleChance implements IRule {

	private String description;

	@Override
	public String getDescription() {
		description="Chance";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		
		return 19;
	}

}
