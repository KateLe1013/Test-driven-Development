package resource.model.rules;

public class RuleChance implements IRule {

	@Override
	public String getDescription() {
	
		return "Chance";
	}

	@Override
	public int getScore(int[] dice) {
		
		return 0;
	}

}
