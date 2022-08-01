package application;

public class BmiCalculation {
	private int bmiValue;

	public BmiCalculation(int userWeight, int userHeight) {
		bmiValue = (int) (userWeight / Math.pow(userHeight, 2)/100);
	}

	public String toString() {
		return bmiValue+"";
	}

}
