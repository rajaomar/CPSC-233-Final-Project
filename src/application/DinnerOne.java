package application;

public class DinnerOne extends Food {

	@Override
	public double calculateCalories() {
		return 314;
	}

	@Override
	public String toString() {
		return "Baked Salmon with Garlic and Dijon";
	}

}
