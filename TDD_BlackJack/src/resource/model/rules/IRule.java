package resource.model.rules;

public interface IRule {
String getDescription();
int getScore(int[] dice);
}