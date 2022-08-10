package application;

public class BreakfastFive extends Food {

	@Override
	public double calculateCalories() {
		return 480;
	}

	@Override
	public String toString() {
		return "Oatmeal, 2 boiled eggs";
	}

}
