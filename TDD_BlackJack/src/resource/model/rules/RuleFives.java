package resource.model.rules;

public class RuleFives implements IRule {
	private String description;
	
	@Override
	public String getDescription() {
		description="Fives";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		
		return 0;
	}

}
