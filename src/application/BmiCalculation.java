package application;

public class BmiCalculation {
	private double bmiValue;

	public BmiCalculation(double userWeight, int userHeight) {
		bmiValue = userWeight / Math.pow(userHeight, 2);
	}

	public String toString() {
		return String.format("%.1f", String.valueOf(bmiValue));
	}

}
