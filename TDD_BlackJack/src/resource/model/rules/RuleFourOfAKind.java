package resource.model.rules;

public class RuleFourOfAKind implements IRule {

	@Override
	public String getDescription() {
		return "Four Of A Kind";
	}

	@Override
	public int getScore(int[] dice) {
		return 0;
	}

}
