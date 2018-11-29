package resource.model.rules;

public class RuleThreeOfAKind implements IRule {

	@Override
	public String getDescription() {
		return "Three Of A Kind";
	}

	@Override
	public int getScore(int[] dice) {
		return 0;
	}

}
