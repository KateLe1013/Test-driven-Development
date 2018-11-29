package resource.model.rules;

public class RuleAces implements IRule {

	private String description;

	@Override
	public String getDescription() {
		description = "Aces";
		return description;
	}
}
