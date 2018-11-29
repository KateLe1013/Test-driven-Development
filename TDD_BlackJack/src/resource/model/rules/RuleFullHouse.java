package resource.model.rules;

public class RuleFullHouse implements IRule {

	@Override
	public String getDescription() {
		
		return "Full House";
	}

	@Override
	public int getScore(int[] dice) {
		
		return 0;
	}

}
