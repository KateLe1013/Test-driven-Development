package resource.model.rules;

public class RuleFours implements IRule {

	private String description;

	@Override
	public String getDescription() {
		description = "Fours";
		return description;
	}

	@Override
	public int getScore(int[] dice) {

		return 0;
	}

}