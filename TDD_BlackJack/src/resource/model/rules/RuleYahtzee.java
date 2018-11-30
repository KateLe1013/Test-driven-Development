package resource.model.rules;

public class RuleYahtzee implements IRule {

	@Override
	public String getDescription() {
		
		return "Yahtzee";
	}

	@Override
	public int getScore(int[] dice) {
	
		return 0;
	}

}
