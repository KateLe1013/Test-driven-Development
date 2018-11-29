package resource.model.rules;

public class RuleFives implements IRule {

	@Override
	public String getDescription() {
		
		return "Fives";
	}

	@Override
	public int getScore(int[] dice) {
		
		return 0;
	}

}
