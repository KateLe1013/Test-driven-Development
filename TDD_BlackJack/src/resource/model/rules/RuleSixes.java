package resource.model.rules;

public class RuleSixes implements IRule {
	private String description;
	
	@Override
	public String getDescription() {
		description="Sixes";
		return description;
	}

	@Override
	public int getScore(int[] dice) {
		
		return 18;
	}

}
