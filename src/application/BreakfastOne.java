package application;

public class BreakfastOne extends Food {
	private String name;
		
	@Override
	public double calculateCalories() {
		return 651;
	}

	@Override
	public String toString() {
		return "Omelet with mac and cheese";
	}

}
