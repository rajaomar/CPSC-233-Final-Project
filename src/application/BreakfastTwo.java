package application;

public class BreakfastTwo extends Food {

	@Override
	public double calculateCalories() {
		return 400;
	}

	@Override
	public String toString() {
		return "One bowl of cereal with 2 large bananas";
	}

}
