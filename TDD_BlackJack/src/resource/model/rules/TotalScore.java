package resource.model.rules;

public class TotalScore {

	private String rule;
	private int score;
	private int totalUpperSectionScore;
	private int totalScore;
	private final int BONUS = 35;

	public TotalScore(IRule r, int[] dice) {
		rule = r.getDescription();
		score = r.getScore(dice);
	}

	public int getTotalUpperSectionScore() {
		if (rule.equals("Aces") || rule.equals("Twos") || rule.equals("Threes") || rule.equals("Fours")
				|| rule.equals("Fives") || rule.equals("Sixes")) {
			totalUpperSectionScore += score;
		}
			totalScore += score;	
		return score;
	}

	public int getBonus() {
		if (totalUpperSectionScore >= 63) {
			return totalScore+BONUS;
		}
		return totalScore;
	}
}
