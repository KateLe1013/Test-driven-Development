package resource.model.rules;

public class RuleTwos implements IRule {

	@Override
	public String getDescription() {
		return "Twos";
	}

	@Override
	public int getScore(int[] dice) {
		return 0;
	}

}
