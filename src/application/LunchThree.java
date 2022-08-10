package application;

public class LunchThree extends Food {

	@Override
	public double calculateCalories() {
		return 900;
	}

	@Override
	public String toString() {
		return "Hamburger with fries";
	}

}
