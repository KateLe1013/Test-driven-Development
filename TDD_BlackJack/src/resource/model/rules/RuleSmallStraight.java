package resource.model.rules;

public class RuleSmallStraight implements IRule {

	@Override
	public String getDescription() {
		
		return "Small Straight";
	}

	@Override
	public int getScore(int[] dice) {
		
		return 0;
	}

}
