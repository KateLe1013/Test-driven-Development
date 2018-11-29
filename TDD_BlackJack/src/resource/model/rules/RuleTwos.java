package resource.model.rules;

public class RuleTwos implements IRule {

	private String description;

	@Override
	public String getDescription() {
		description="Twos";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		return 4;
	}

}
