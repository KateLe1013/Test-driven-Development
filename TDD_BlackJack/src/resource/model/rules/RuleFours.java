package resource.model.rules;

public class RuleFours implements IRule {

	@Override
	public String getDescription() {
		
		return "Fours";
	}

	@Override
	public int getScore(int[] dice) {
		
		return 0;
	}

}
