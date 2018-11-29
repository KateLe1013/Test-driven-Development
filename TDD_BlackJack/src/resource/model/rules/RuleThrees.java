package resource.model.rules;

public class RuleThrees implements IRule {

	@Override
	public String getDescription() {

		return "Threes";
	}

	@Override
	public int getScore(int[] dice) {
		
		return 0;
	}

}
