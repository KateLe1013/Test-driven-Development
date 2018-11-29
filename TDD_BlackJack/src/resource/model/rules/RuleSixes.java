package resource.model.rules;

public class RuleSixes implements IRule {

	@Override
	public String getDescription() {
		
		return "Sixes";
	}

	@Override
	public int getScore(int[] dice) {
		
		return 0;
	}

}
