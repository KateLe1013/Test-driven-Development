package resource.model.rules;

public class RuleLargeStraight implements IRule {

	@Override
	public String getDescription() {
		
		return "Large Straight";
	}

	@Override
	public int getScore(int[] dice) {
		
		return 0;
	}

}
